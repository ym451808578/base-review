package org.example.pattern.builder;

/**
 * @author Castle
 * @Date 2021/5/18 11:18
 */
public class SkyHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("摩天大楼地基20米");
    }

    @Override
    public void buildWall() {
        System.out.println("摩天大楼墙厚50cm");
    }

    @Override
    public void buildWindow() {
        System.out.println("摩天大楼安装窗户");
    }

    @Override
    public void buildRoof() {
        System.out.println("摩天大楼平屋顶");
    }
}
