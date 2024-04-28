package abstract_factory.products;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }
}
