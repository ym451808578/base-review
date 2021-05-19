package org.example.pattern.decorator;

/**
 * @author Castle
 * @Date 2021/5/19 10:44
 */
public class SugarDecorator extends Decorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return super.getName() + " with sugar";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
