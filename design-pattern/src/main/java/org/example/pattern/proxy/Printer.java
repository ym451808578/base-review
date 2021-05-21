package org.example.pattern.proxy;

/**
 * @author Castle
 * @Date 2021/5/21 8:13
 */
public class Printer implements IPrinter {

    private String name;

    public Printer(String name) {
        this.name = name;
        System.out.println("实例化一个真实的打印机：" + name);
    }

    @Override
    public void print(String msg) {
        System.out.println("这是来自" + this.name + "打印的：" + msg);
    }

    @Override
    public void manyPrint() {
        System.out.println("这是一个很耗费时间的工作，由打印机" + this.name + "完成");
    }
}
