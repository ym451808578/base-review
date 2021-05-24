package org.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Castle
 * @Date 2021/5/24 15:46
 */
public abstract class NumberGenerator {
    private List<IObserver> observers = new ArrayList<>();

    public void registryObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNum();

    public abstract void execute();
}
