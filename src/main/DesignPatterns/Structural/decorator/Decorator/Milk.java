package decorator.Decorator;

import decorator.Component.Coffee;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double cost(){
        return super.cost()+2;
    }
    public String description(){
        return super.description()+", milk";
    }
}
