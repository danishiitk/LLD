package composite;

public class Leaf implements Component{
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Operating on leaf: "+name);
    }
}
