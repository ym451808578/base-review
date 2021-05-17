package org.example.pattern.factory.normal;

/**
 * @author 45180
 */
public class HpMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
