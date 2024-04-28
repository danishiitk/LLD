package builder;
public interface PizzaBuilder {
    public void addSize();
    public void addDough();
    public void addTopping();
    public void addSauce();
    public Pizza getPizza();
}
