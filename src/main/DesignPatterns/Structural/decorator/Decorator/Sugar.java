package decorator.Decorator;

import decorator.Component.Coffee;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public double cost(){
        return super.cost()+1;
    }
    public String description(){
        return super.description()+", sugar";
    }
}
