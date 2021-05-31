package org.example.pattern.strategy;

/**
 * @author Castle
 * @Date 2021/5/31 10:16
 */
public class Client {
    public static void main(String[] args) {
        Player player1 = new Player("张三", new WinningStrategy());
        Player player2 = new Player("张三", new HistoryStrategy());

        for (int i = 0; i < 10; i++) {
            Hand p1hand = player1.nextHand();
            Hand p2Hand = player2.nextHand();
            if (p1hand.isWin(p2Hand)) {
                player1.win();
                player2.lose();
            } else if (p1hand.isLose(p2Hand)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }
        }
        System.out.println(player1);
        System.out.println(player2);
    }
}
