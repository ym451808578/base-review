package org.example.pattern.visitor;

import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/24 11:22
 */
public abstract class Staff {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Staff(String name) {
        this.name = name;
        this.salary = new Random().nextInt(10000);
    }

    public abstract void accept(IVisitor visitor);
}
