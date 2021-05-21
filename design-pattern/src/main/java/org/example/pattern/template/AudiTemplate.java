package org.example.pattern.template;

/**
 * @author Castle
 * @Date 2021/5/21 11:12
 */
public abstract class AudiTemplate {

    protected abstract void startEngine();

    protected abstract void startRun();

    protected void warmChair() {
        System.out.println("给座椅加热");
    }

    public final void startTemplate() {
        startEngine();
        if (isLuxury()) {
            warmChair();
        }
        startRun();
    }

    //钩子方法，决定是否座椅加热
    protected boolean isLuxury() {
        return false;
    }
}
