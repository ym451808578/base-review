package org.example.principle.dip;

/**
 * @author 45180
 */
public class Client1 {
    public static void main(String[] args) {
        Driver zs = new Driver();
        Benz benz = new Benz();
        zs.drive(benz);
    }
}

class Driver {
    public void drive(Benz benz) {
        benz.run();
    }
}

class Benz {
    public void run() {
        System.out.println("奔驰汽车跑起来了");
    }
}