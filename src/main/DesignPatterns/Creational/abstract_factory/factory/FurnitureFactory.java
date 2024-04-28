package abstract_factory.factory;

import abstract_factory.products.Chair;
import abstract_factory.products.Sofa;

//AbstractFactory --> Create different products/objects using the same abstract factory
public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
}
