package org.example.principle.srp;

/**
 * @author 45180
 */
public class VehicleSrp1 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑~~~");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上飞~~~");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上漂~~~");
    }
}