package template;

public class BiryaniRecipe extends Recipe{
    @Override
    public void addIngredients() {
        System.out.println("Add Rice, Chicken, Masala");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Biryani");
    }
}
