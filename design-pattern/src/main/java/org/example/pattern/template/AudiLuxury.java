package org.example.pattern.template;

/**
 * @author Castle
 * @Date 2021/5/21 11:19
 */
public class AudiLuxury extends AudiTemplate {
    @Override
    protected void startEngine() {
        System.out.println("以3.0T启动");
    }

    @Override
    protected void startRun() {
        System.out.println("以3秒百公里加速");
    }

    @Override
    protected boolean isLuxury() {
        return true;
    }
}
