package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:09
 */
public class OpenLiftState extends LiftState {


    @Override
    public void open() {
        System.out.println("电梯门是开启的");
    }

    //开启时可以关闭
    @Override
    public void close() {
        super.context.setLiftState(Context.closeLiftState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
