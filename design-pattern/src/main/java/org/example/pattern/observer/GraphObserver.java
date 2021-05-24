package org.example.pattern.observer;

/**
 * @author Castle
 * @Date 2021/5/24 15:58
 */
public class GraphObserver implements IObserver {
    @Override
    public void update(NumberGenerator numberGenerator) {
        for (int i = 0; i < numberGenerator.getNum(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
