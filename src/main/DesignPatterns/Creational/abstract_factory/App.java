package abstract_factory;

import abstract_factory.factory.FurnitureFactory;
import abstract_factory.factory.ModernFurnitureFactory;
import abstract_factory.factory.VictorianFurnitureFactory;
import abstract_factory.products.Chair;
import abstract_factory.products.Sofa;

public class App {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        modernChair.sitOn();

        FurnitureFactory vitorianFurnitureFactory = new VictorianFurnitureFactory();
        Sofa victorianSofa = vitorianFurnitureFactory.createSofa();
        victorianSofa.relaxOn();
    }
}
