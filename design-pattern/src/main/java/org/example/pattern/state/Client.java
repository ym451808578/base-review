package org.example.pattern.state;

/**
 * @author Castle
 * @Date 2021/5/27 15:30
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new CloseLiftState());
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();
    }
}
