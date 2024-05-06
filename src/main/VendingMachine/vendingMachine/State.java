package vendingMachine;

import myapproach.items.Item;

public interface State {
    void collectCash(double cashCollected);
    void dispenseChange(Item item, int quantity);
    void dispenseItem(Item item, int quantity);
    void cancelTransaction();
}
