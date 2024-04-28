package builder;

public class Pizza {
    int size;
    String dough;
    String topping;
    String sauce;

    @Override
    public String toString(){
        return "Pizza with" + "Size: "+size+" Topping: "+topping + " Sauce: "+sauce;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
