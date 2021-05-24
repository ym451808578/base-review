package org.example.pattern.visitor;

import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/24 11:26
 */
public class ManagerStaff extends Staff {
    public ManagerStaff(String name) {
        super(name);
    }

    public int getProject() {
        return new Random().nextInt(10);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
