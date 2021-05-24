package org.example.pattern.observer;

/**
 * @author Castle
 * @Date 2021/5/24 15:58
 */
public class DigitObserver implements IObserver {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println(numberGenerator.getNum());
    }
}
