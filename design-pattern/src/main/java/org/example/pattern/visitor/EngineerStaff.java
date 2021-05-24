package org.example.pattern.visitor;

import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/24 11:24
 */
public class EngineerStaff extends Staff {

    public EngineerStaff(String name) {
        super(name);
    }

    public int getWorks() {
        return new Random().nextInt(1000);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
