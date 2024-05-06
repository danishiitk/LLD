package vendingMachine;

import myapproach.items.Item;

public class ReadyState implements State {
    VendingMachine vendingMachine;
    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void collectCash(double cashCollected) {
        this.vendingMachine.setCashCollected(cashCollected);
    }

    @Override
    public void dispenseChange(Item item, int quantity) {
        this.vendingMachine.setState(new DispenseChangeState(this.vendingMachine));
        this.vendingMachine.dispenseChange(item, quantity);
    }

    @Override
    public void dispenseItem(Item item, int quantity) {
        throw new RuntimeException("Can't dispense item right now");
    }

    @Override
    public void cancelTransaction() {
        this.vendingMachine.setState(new TransactionCancelledState(this.vendingMachine));
        this.vendingMachine.cancelTransaction();
    }
}
