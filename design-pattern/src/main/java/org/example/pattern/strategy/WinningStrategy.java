package org.example.pattern.strategy;

import java.util.Random;

/**
 * 如果赢了，就和上次一样
 * 如果输了，下次随机
 *
 * @author Castle
 * @Date 2021/5/31 9:08
 */
public class WinningStrategy implements IStrategy {

    private Hand prev = new Hand(new Random().nextInt(3));
    private boolean win = false;

    @Override
    public Hand nextHand() {
        if (win) {
            return prev;
        }
        return prev.getHand(new Random().nextInt(3));
    }

    @Override
    public void study(boolean win) {
        this.win = win;
    }
}
