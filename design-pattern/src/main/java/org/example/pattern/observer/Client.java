package org.example.pattern.observer;

/**
 * @author Castle
 * @Date 2021/5/24 16:00
 */
public class Client {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        IObserver dObserver = new DigitObserver();
        IObserver gObserver = new GraphObserver();
        numberGenerator.registryObserver(dObserver);
        numberGenerator.registryObserver(gObserver);
        numberGenerator.execute();
    }
}
