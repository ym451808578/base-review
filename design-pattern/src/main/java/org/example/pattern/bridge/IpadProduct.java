package org.example.pattern.bridge;

/**
 * @author Castle
 * @Date 2021/5/19 8:29
 */
public class IpadProduct implements IProduct {
    @Override
    public void beProduced() {
        System.out.println("ipad生产出来了");
    }

    @Override
    public void beSold() {
        System.out.println("ipad卖掉了");
    }
}
