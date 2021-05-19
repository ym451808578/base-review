package org.example.pattern.decorator;

/**
 * @author Castle
 * @Date 2021/5/19 10:39
 */
public abstract class Decorator implements ICoffee {

    private ICoffee coffee;

    public Decorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return this.coffee.getPrice();
    }

    @Override
    public String getName() {
        return this.coffee.getName();
    }
}
