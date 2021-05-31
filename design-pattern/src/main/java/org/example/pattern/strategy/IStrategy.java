package org.example.pattern.strategy;

/**
 * @author Castle
 * @Date 2021/5/31 9:06
 */
public interface IStrategy {

    abstract Hand nextHand();

    abstract void study(boolean win);
}
