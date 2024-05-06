package vendingMachine;

import myapproach.items.Item;

public class DispenseChangeState implements State {
    VendingMachine vendingMachine;
    public DispenseChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(double cashCollected) {
        throw new RuntimeException("Can't collect cash at this time");
    }

    @Override
    public void dispenseChange(Item item, int quantity) {
        double change = this.vendingMachine.calculateChange(item, quantity);
        System.out.println("Change dispensed: "+change);
        this.vendingMachine.setState(new DispenseItemState(this.vendingMachine));
        this.vendingMachine.dispenseItem(item, quantity);
    }

    @Override
    public void dispenseItem(Item item, int quantity) {
        throw new RuntimeException("Can't dispense item at this time");
    }

    @Override
    public void cancelTransaction() {
        throw new RuntimeException("Can't cancel the transaction at this time");
    }
}
