package builder;

public class PizzaDirector {
    public Pizza buildPizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.addSize();
        pizzaBuilder.addDough();
        pizzaBuilder.addTopping();
        pizzaBuilder.addSauce();
        return pizzaBuilder.getPizza();
    }
}
