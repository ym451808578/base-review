package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:11
 */
public class CloseLiftState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openLiftState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门是关闭的");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runLiftState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {

    }
}
