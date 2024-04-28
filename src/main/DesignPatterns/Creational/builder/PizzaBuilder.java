package builder;

import singleton.ParkingLot;

public interface PizzaBuilder {
    public void addSize();
    public void addDough();
    public void addTopping();
    public void addSauce();
    public Pizza getPizza();
}
