package org.example.pattern.proxy.dynamic;

/**
 * @author Castle
 * @Date 2021/5/21 8:55
 */
public class Printer implements IPrint {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("这是一个普通的打印工作");
    }

    @Override
    public void manyPrint() {
        System.out.println("这是一个很费劲的打印工作");
    }
}
