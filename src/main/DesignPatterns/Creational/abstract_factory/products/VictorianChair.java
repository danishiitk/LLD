package abstract_factory.products;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian chair");
    }
}
