package flyweight;
// Concrete flyweight class
public class ConcreteCharacter implements Character{
    private final char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(int position) {
        System.out.println("Drawing character "+symbol+" at position "+position);
    }
}
