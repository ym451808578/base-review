package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:13
 */
public class Context {
    public static OpenLiftState openLiftState = new OpenLiftState();
    public static CloseLiftState closeLiftState = new CloseLiftState();
    public static RunLiftState runLiftState = new RunLiftState();
    public static StopLiftState stopLiftState = new StopLiftState();

    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
