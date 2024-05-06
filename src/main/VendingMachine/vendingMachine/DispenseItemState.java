package vendingMachine;

import myapproach.items.Item;

import java.util.Map;

public class DispenseItemState implements State {
    VendingMachine vendingMachine;
    public DispenseItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(double cashCollected) {
        throw new RuntimeException("Can't collect cash at this time");
    }

    @Override
    public void dispenseChange(Item item, int quantity) {
        throw new RuntimeException("Can't dispense chane at this time");
    }

    @Override
    public void dispenseItem(Item item, int quantity) {
        int quantityAvailable = this.vendingMachine.itemQuantityMap.get(item);
        if (quantityAvailable >= quantity) {
            System.out.println("Dispatch: " + item.getItemType() + " quantity = " + quantity);
            this.vendingMachine.removeItem(item, quantity);
        } else {
            System.out.println("Only " + quantityAvailable + " " + item.getItemType() + " are available");
        }
        vendingMachine.setState(new ReadyState(this.vendingMachine));
    }

    @Override
    public void cancelTransaction() {

    }
}
