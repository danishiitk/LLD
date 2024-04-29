package template;

public class App {
    public static void main(String[] args) {
        Recipe biryaniRecipe = new BiryaniRecipe();
        biryaniRecipe.prepareRecipe();

        Recipe pizzaRecipe = new PizzaRecipe();
        pizzaRecipe.prepareRecipe();
    }
}
