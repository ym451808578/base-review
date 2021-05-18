package org.example.pattern.builder;

/**
 * @author Castle
 * @Date 2021/5/18 11:10
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildWindow();

    public abstract void buildRoof();

    public House build() {
        return house;
    }
}
