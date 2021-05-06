package org.example;

public class Thread3 extends Thread{

    public Thread3(){
        System.out.println("构造方法中，currentThread.getName():"+Thread.currentThread().getName());
        System.out.println("构造方法的名称："+this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法中，currentThread.getName():"+Thread.currentThread().getName());
        System.out.println("run方法的名称："+this.getName());
    }
}
