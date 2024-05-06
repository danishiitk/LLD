package myapproach;

import myapproach.items.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    int capacity;
    int curCountItems;
    Map<Item, Integer> itemQuantityMap;
    VendingMachine(int capacity){
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
    public void removeItem(Item item, int quantity){
        if(itemQuantityMap.containsKey(item)) {
            itemQuantityMap.put(item, itemQuantityMap.get(item) - quantity);
            curCountItems -= quantity;
        }else{
            System.out.println("Item already not present");
        }
    }
    public void dispatch(Map<Item, Integer> itemsPurchased){
        double charge=0;
        for(Map.Entry<Item, Integer> entry: itemsPurchased.entrySet()){
            Item purchaseItem = entry.getKey();
            int purchaseQuantity = entry.getValue();
            int quantityAvailable = itemQuantityMap.get(purchaseItem);
            if(quantityAvailable>=purchaseQuantity){
                System.out.println("Dispatch: "+purchaseItem.getItemType()+" quantity = "+purchaseQuantity);
                charge +=purchaseItem.getPrice()*purchaseQuantity;
                this.removeItem(purchaseItem, purchaseQuantity);
            } else{
                System.out.println("Only "+quantityAvailable+" "+purchaseItem.getItemType()+" are available");
            }
        }
        System.out.println("Please pay: "+charge);
        Scanner sc = new Scanner(System.in);
        double amountPaid = sc.nextDouble();
        double change = amountPaid-charge;
        System.out.println(" Change returned: "+change);
    }
}
