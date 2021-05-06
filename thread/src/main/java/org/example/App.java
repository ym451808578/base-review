package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread1();
        Thread2 run = new Thread2();
        thread1.start();
        Thread thread2 = new Thread(run);
        thread2.start();

        for (int i = 0; i < 100; i++) {
            int random = (int) Math.random() * 1000;
            System.out.println("Main Thread====>" + i);
            Thread.sleep(random);
        }
    }
}
