package org.example.pattern.strategy;

import lombok.Data;
import lombok.ToString;

/**
 * @author Castle
 * @Date 2021/5/31 10:12
 */
@Data
@ToString(exclude = "strategy")
public class Player {
    private String name;
    private IStrategy strategy;

    private int loseCount;
    private int winCount;
    private int evenCount;
    private int gameCount;

    public Player(String name, IStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        evenCount++;
        gameCount++;
    }
}
