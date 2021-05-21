package org.example.pattern.template;

/**
 * @author Castle
 * @Date 2021/5/21 11:17
 */
public class AudiComfortable extends AudiTemplate {
    @Override
    protected void startEngine() {
        System.out.println("以2.0T启动");
    }

    @Override
    protected void startRun() {
        System.out.println("以5秒百公里加速");
    }
}
