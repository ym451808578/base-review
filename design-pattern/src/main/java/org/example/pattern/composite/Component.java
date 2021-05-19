package org.example.pattern.composite;

import lombok.Data;

/**
 * @author Castle
 * @Date 2021/5/19 15:53
 */
@Data
public abstract class Component {

    private String username;
    private String pos;

    public Component(String username, String pos) {
        this.username = username;
        this.pos = pos;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void print();
}
