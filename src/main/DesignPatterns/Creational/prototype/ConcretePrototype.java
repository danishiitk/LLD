package prototype;

public class ConcretePrototype implements Prototype{
    private String property;
    public ConcretePrototype(String property){
        this.property = property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.property);
    }

    @Override
    public String toString(){
        return "ConcretePrototype{"+"property = "+property+"}";
    }
}
