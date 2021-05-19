package org.example.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Castle
 * @Date 2021/5/19 16:08
 */
public class Manager extends Component {
    List<Component> components = new ArrayList<>();

    public Manager(String username, String pos) {
        super(username, pos);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this);
        for (Component component : components) {
            component.print();
        }
    }
}
