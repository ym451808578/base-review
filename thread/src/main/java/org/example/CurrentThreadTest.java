package org.example;

public class CurrentThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread3 thread3=new Thread3();
        thread3.setName("t3");
        thread3.start();

        Thread.sleep(1000);
        System.out.println("========");

        Thread thread=new Thread(thread3);
        thread.start();
    }
}
