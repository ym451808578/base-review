package org.example.pattern.strategy;


import java.util.Random;

/**
 * @author Castle
 * @Date 2021/5/31 9:23
 */
public class HistoryStrategy implements IStrategy {

    private int prevValue = new Random().nextInt(3);
    private int currentValue = 0;

    private int[][] history = new int[3][3];

    @Override
    public Hand nextHand() {
        int temp = new Random().nextInt(getSum(currentValue));
        int handValue = 0;
        if (temp < history[currentValue][0]) {
            handValue = 0;
        } else if (temp < history[currentValue][0] + history[currentValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        return Hand.HANDS[handValue];
    }

    private int getSum(int handValue) {
        int sum = 1;
        for (int i = 0; i < history[handValue].length; i++) {
            sum += history[handValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevValue][currentValue]++;
        } else {
            history[prevValue][(currentValue + 1) % 3]++;
            history[prevValue][(currentValue + 2) % 3]++;
        }
    }
}
