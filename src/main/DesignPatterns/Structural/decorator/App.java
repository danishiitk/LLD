package decorator;

import decorator.Component.Coffee;
import decorator.Component.SimpleCoffee;
import decorator.Decorator.CoffeeDecorator;
import decorator.Decorator.Milk;
import decorator.Decorator.Sugar;

public class App {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.cost()+" - "+coffee.description());

        coffee = new Milk(coffee); //Add the object in which we have to add functionality
        System.out.println(coffee.cost()+" - "+coffee.description());

        coffee = new Sugar(coffee);
        System.out.println(coffee.cost()+" - "+coffee.description());
    }
}
