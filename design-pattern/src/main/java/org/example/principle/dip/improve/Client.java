package org.example.principle.dip.improve;

/**
 * @author 45180
 */
public class Client {

    public static void main(String[] args) {

        IDriver zs = new Driver();
        Icar benz = new Benz();
        Icar bmw = new Bmw();
        zs.drive(benz);
        zs.drive(bmw);
    }
}

interface Icar {
    void run();
}


class Benz implements Icar {

    @Override
    public void run() {
        System.out.println("奔驰汽车启动了");
    }
}

class Bmw implements Icar {

    @Override
    public void run() {
        System.out.println("宝马汽车启动了");
    }
}

interface IDriver {
    void drive(Icar car);
}

class Driver implements IDriver {

    @Override
    public void drive(Icar car) {
        car.run();
    }
}