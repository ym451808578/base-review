package org.example.pattern.strategy;

/**
 * @author Castle
 * @Date 2021/5/31 8:44
 */
public class Hand {

    private int handValue;

    public Hand(int value) {
        this.handValue = value;
    }

    public static final int HAND_ROCK = 0;
    public static final int HAND_PAPER = 1;
    public static final int HAND_SCISSORS = 2;
    public static final Hand[] HANDS = {new Hand(HAND_ROCK), new Hand(HAND_PAPER), new Hand(HAND_SCISSORS)};
    private static final String[] names = {"石头", "布", "剪刀"};

    public Hand getHand(int value) {
        return HANDS[value];
    }

    public boolean isWin(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isLose(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return names[handValue];
    }
}
