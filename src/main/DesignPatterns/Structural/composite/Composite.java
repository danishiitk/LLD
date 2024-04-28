package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    public void removeComponent(Component component){
        this.components.remove(component);
    }

    @Override
    public void execute() {
        for (Component component: components){
            component.execute();
        }
    }
}
