package org.example.principle.srp;

/**
 * @author 45180
 */
public class VehicleSrp2 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}


class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上漂");
    }
}