package org.example.pattern.observer;

import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/24 15:56
 */
public class RandomNumberGenerator extends NumberGenerator {

    private int num;

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void execute() {
        num = new Random().nextInt(50);
        notifyObservers();
    }
}
