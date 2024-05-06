package vendingMachine;

import myapproach.items.Item;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    int capacity;
    int curCountItems;
    double cashCollected;
    State state;
    Map<Item, Integer> itemQuantityMap;
    VendingMachine(){
        this.cashCollected = 0;
        state = new ReadyState(this);
        this.itemQuantityMap = new HashMap<>();
        this.capacity = capacity;
        this.curCountItems = 0;
    }
    public void addItem(Item item, int quantity){
        if(curCountItems+quantity<=capacity) {
            itemQuantityMap.put(item, itemQuantityMap.getOrDefault(item, 0) + quantity);
            curCountItems += quantity;
        }else{
            System.out.println("Vending Machine is full");
        }
    }
    public void removeItem(Item item, int quantity) {
        if(itemQuantityMap.containsKey(item)) {
            itemQuantityMap.put(item, itemQuantityMap.get(item) - quantity);
            curCountItems -= quantity;
        }else{
            System.out.println("Item already not present");
        }
    }
    public void addCash(double cashCollected){
        this.state.collectCash(cashCollected);
    }
    public void dispenseChange(Item item, int quantity){
        this.state.dispenseChange(item, quantity);
    }
    public double calculateChange(Item item, int quantity){
        double price = item.getPrice();
        double change = cashCollected - price*quantity;
        return change;
    }
    public void dispenseItem(Item item, int quantity){
        this.state.dispenseItem(item, quantity);
    }
    public void cancelTransaction(){
        this.state.cancelTransaction();
    }
    public void setState(State state){
        this.state = state;
    }

    public void setCashCollected(double cashCollected) {
        this.cashCollected = cashCollected;
    }

    public double getCashCollected() {
        return cashCollected;
    }
}
