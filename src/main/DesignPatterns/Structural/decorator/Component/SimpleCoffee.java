package decorator.Component;
// Concrete Component
public class SimpleCoffee implements Coffee{

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
