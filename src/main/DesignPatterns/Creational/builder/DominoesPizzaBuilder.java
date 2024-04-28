package builder;

public class DominoesPizzaBuilder implements PizzaBuilder{
    Pizza pizza = new Pizza();

    @Override
    public void addSize() {
        pizza.setSize(2);
    }

    @Override
    public void addDough() {
        pizza.setDough("Circular Dough");
    }

    @Override
    public void addTopping() {
        pizza.setTopping("Cheese Topping");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Adding Tomato Sauce");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
