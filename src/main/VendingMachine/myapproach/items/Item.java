package myapproach.items;

public abstract class Item {
    double price;
    ItemType itemType;
    Item(ItemType itemType, double price){
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
