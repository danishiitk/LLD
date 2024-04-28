package abstract_factory.factory;

import abstract_factory.products.Chair;
import abstract_factory.products.ModernChair;
import abstract_factory.products.ModernSofa;
import abstract_factory.products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
