package org.example.pattern.factory.normal;

/**
 * @author 45180
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
