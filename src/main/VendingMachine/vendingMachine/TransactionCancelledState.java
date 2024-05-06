package vendingMachine;

import myapproach.items.Item;

public class TransactionCancelledState implements State {
    VendingMachine vendingMachine;
    public TransactionCancelledState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(double cashCollected) {
        throw new RuntimeException("Can't collect cash");
    }

    @Override
    public void dispenseChange(Item item, int quantity) {
        throw new RuntimeException("Can't dispense change");
    }

    @Override
    public void dispenseItem(Item item, int quantity) {
        throw new RuntimeException("Can't dispense item right now");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Returning collected cash: "+this.vendingMachine.getCashCollected());
        vendingMachine.setCashCollected(0);
        this.vendingMachine.setState(new ReadyState(this.vendingMachine));
    }
}
