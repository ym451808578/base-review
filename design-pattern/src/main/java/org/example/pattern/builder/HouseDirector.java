package org.example.pattern.builder;

/**
 * @author Castle
 * @Date 2021/5/18 11:20
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //A类方式，先封顶，再整窗户
    public House AHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        houseBuilder.buildWindow();
        return houseBuilder.build();
    }

    //B类方式，先整窗户，再封顶
    public House BHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildWindow();
        houseBuilder.buildRoof();
        return houseBuilder.build();
    }
}
