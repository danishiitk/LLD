package prototype;

public class App {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Danish");

        // Clone the prototype
        ConcretePrototype clone1 = (ConcretePrototype) prototype.clone();
        System.out.println("Clone 1: " + clone1);

        // Modify the property of the clone
        clone1.setProperty("Modified property value");
        System.out.println("Clone 1 after modification: " + clone1);

        // Clone the prototype again
        ConcretePrototype clone2 = (ConcretePrototype) prototype.clone();
        System.out.println("Clone 2: " + clone2);
    }
}
