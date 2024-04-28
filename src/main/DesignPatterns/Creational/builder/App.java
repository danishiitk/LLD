package builder;

public class App {
    public static void main(String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();
        PizzaBuilder dominoesPizzaBuilder = new DominoesPizzaBuilder();
        Pizza dominoesPizza = pizzaDirector.buildPizza(dominoesPizzaBuilder);
        System.out.println(dominoesPizza.toString());
    }
}
