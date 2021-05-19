package org.example.pattern.bridge;

/**
 * @author Castle
 * @Date 2021/5/19 8:30
 */
public class XiaoMiProduct implements IProduct {
    @Override
    public void beProduced() {
        System.out.println("小米手机生产出来了");
    }

    @Override
    public void beSold() {
        System.out.println("小米手机卖掉了");
    }
}
