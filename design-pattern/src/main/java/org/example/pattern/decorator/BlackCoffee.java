package org.example.pattern.decorator;

/**
 * @author Castle
 * @Date 2021/5/19 10:37
 */
public class BlackCoffee implements ICoffee {
    @Override
    public String getName() {
        return "Black Coffee";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
