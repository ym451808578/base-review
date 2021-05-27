package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:11
 */
public class RunLiftState extends LiftState {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    //运行时只能停止
    @Override
    public void stop() {
        super.context.setLiftState(Context.stopLiftState);
        super.context.getLiftState().stop();
    }
}
