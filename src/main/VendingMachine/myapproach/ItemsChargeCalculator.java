package myapproach;

import myapproach.items.Item;

import java.util.Map;

public class ItemsChargeCalculator {
    public double calculateCharge(Map<Item, Integer> itemsPurchased){
        double charge=0;
        for(Map.Entry<Item, Integer> entry: itemsPurchased.entrySet()){
            Item item = entry.getKey();
            int quantity = entry.getValue();
            double price = item.getPrice();
            charge += price*quantity;
        }
        return charge;
    }
}
