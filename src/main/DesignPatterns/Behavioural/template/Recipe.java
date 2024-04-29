package template;

public abstract class Recipe {
    public final void prepareRecipe(){
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void addIngredients();

    public abstract void cook();

    void serve() {
        System.out.println("Serving the food");
    }
}
