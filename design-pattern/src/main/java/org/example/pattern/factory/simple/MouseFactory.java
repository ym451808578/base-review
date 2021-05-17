package org.example.pattern.factory.simple;

/**
 * @author 45180
 */
public class MouseFactory {

    public static Mouse createMouse(int i) {
        switch (i) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return null;
        }
    }
}
