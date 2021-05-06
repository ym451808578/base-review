package org.example;

/**
 * @author castle
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Sub Thread1====>" + i);
        }
    }
}
