package org.example.pattern.decorator;

/**
 * @author Castle
 * @Date 2021/5/19 10:46
 */
public class Client {
    public static void main(String[] args) {
        //要一杯单纯的黑咖啡
        ICoffee coffee = new BlackCoffee();
        System.out.println("咖啡名：" + coffee.getName());
        System.out.println("咖啡价格：" + coffee.getPrice());
        System.out.println("********");
        //不好喝，加一份牛奶
        System.out.println("咖啡添加1份牛奶");
        coffee = new MilkDecorator(coffee);
        System.out.println("咖啡名：" + coffee.getName());
        System.out.println("咖啡价格：" + coffee.getPrice());
        System.out.println("*********");
        //还不好喝，再加一份糖
        System.out.println("咖啡添加1份糖");
        coffee = new SugarDecorator(coffee);
        System.out.println("咖啡名：" + coffee.getName());
        System.out.println("咖啡价格：" + coffee.getPrice());
        System.out.println("********");
        //还是怪怪的，再加一份牛奶（合计2份牛奶了）
        System.out.println("咖啡添加1份牛奶");
        coffee = new MilkDecorator(coffee);
        System.out.println("咖啡名：" + coffee.getName());
        System.out.println("咖啡价格：" + coffee.getPrice());

    }
}
