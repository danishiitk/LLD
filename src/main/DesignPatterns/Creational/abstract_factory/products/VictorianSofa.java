package abstract_factory.products;

public class VictorianSofa implements Sofa{
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on Victorian Sofa");
    }
}
