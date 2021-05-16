package org.example.principle.srp;

/**
 * @author 45180
 */
public class VehicleOra {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑~~~~");
    }
}