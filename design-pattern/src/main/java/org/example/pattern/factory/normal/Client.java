package org.example.pattern.factory.normal;

/**
 * @author 45180
 */
public class Client {
    public static void main(String[] args) {
        MouseFactory mouseFactory=new DellMouseFactory();
        mouseFactory.createMouse().sayHi();
        mouseFactory=new HpMouseFactory();
        mouseFactory.createMouse().sayHi();
    }
}
