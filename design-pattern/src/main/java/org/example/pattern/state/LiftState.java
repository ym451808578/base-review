package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:08
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
