package org.example;

/**
 * @author castle
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Sub Thread2=====>" + i);
        }
    }
}
