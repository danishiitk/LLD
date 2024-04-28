package abstract_factory.factory;

import abstract_factory.products.Chair;
import abstract_factory.products.Sofa;
import abstract_factory.products.VictorianChair;
import abstract_factory.products.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
