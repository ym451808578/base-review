package org.example.pattern.decorator;

/**
 * @author Castle
 * @Date 2021/5/19 10:43
 */
public class MilkDecorator extends Decorator {
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + " with milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
