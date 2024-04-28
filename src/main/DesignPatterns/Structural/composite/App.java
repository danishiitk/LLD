package composite;

public class App {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        Leaf leaf3 = new Leaf("Leaf3");

        Composite composite = new Composite();
        composite.addComponent(leaf1);
        composite.addComponent(leaf2);

        Composite composite1 = new Composite();
        composite1.addComponent(composite);
        composite1.addComponent(leaf3);

        Composite composite2 = new Composite();
        composite2.addComponent(composite);
        composite2.addComponent(composite1);
        composite2.addComponent(leaf1);

        composite2.execute();
    }
}
