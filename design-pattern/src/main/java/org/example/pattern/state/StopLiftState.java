package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:12
 */
public class StopLiftState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openLiftState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeLiftState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runLiftState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯是停止的");
    }
}
