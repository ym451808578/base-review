package org.example.pattern.builder;

/**
 * @author Castle
 * @Date 2021/5/18 11:27
 */
public class Client {
    public static void main(String[] args) {
        NormalHouseBuilder normalHouseBuilder=new NormalHouseBuilder();
        SkyHouseBuilder skyHouseBuilder=new SkyHouseBuilder();
        HouseDirector director=new HouseDirector(normalHouseBuilder);
        director.AHouse();
        System.out.println("************");
        director.BHouse();
        System.out.println("************");
        director=new HouseDirector(skyHouseBuilder);
        director.AHouse();
        System.out.println("************");
        director.BHouse();
    }
}
