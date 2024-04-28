package abstract_factory.products;

public class ModernSofa implements Sofa{
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on Modern Sofa");
    }
}
