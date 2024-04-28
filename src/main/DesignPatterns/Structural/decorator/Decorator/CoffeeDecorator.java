package decorator.Decorator;

import decorator.Component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }
    public double cost(){
        return decoratedCoffee.cost();
    }
    public String description(){
        return decoratedCoffee.description();
    }
}
