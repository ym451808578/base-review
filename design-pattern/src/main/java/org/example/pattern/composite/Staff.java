package org.example.pattern.composite;

/**
 * @author Castle
 * @Date 2021/5/19 15:59
 */
public class Staff extends Component {
    public Staff(String username, String pos) {
        super(username, pos);
    }

    @Deprecated
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
