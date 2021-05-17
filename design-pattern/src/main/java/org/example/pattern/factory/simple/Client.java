package org.example.pattern.factory.simple;

/**
 * @author 45180
 */
public class Client {

    public static void main(String[] args) {
        Mouse mouse=MouseFactory.createMouse(0);
        mouse.sayHi();

        mouse=MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
