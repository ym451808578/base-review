package org.example.pattern.builder;

/**
 * @author Castle
 * @Date 2021/5/18 11:15
 */
public class NormalHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房屋打地基1米");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房屋盖墙10cm厚");
    }

    @Override
    public void buildWindow() {
        System.out.println("普通房屋1个窗户");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房屋三角形房顶");
    }
}
