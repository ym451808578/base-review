package org.example.pattern.facade;

/**
 * @author 45180
 */
public class Client {

    public static void main(String[] args) {
        XiaoAi xiaoAi = new XiaoAi();
        System.out.println("小爱同学，我下班回来了");
        xiaoAi.backHome();
        System.out.println("************");
        System.out.println("小爱同学，我要睡了");
        xiaoAi.goBed();
        System.out.println("************");
        System.out.println("小爱同学，我要起床了");
        xiaoAi.wakeUp();
    }
}
