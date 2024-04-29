package template;

public class PizzaRecipe extends Recipe{
    @Override
    public void addIngredients() {
        System.out.println("Adding dough, cheese, and toppings");
    }

    @Override
    public void cook() {
        System.out.println("Baking the pizza in the oven.");
    }
}
