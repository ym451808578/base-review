package org.example.pattern.proxy;

/**
 * @author Castle
 * @Date 2021/5/21 8:34
 */
public class PrinterProxy implements IPrinter {

    private String name;

    private Printer printer;

    public PrinterProxy(String name) {
        this.name = name;
        System.out.println("实例化一个代理打印机：" + name);
    }

    @Override
    public void print(String msg) {
        System.out.println("一个轻松的任务，由代理打印机" + this.name + "完成：" + msg);
    }

    @Override
    public void manyPrint() {
        printer = new Printer("realPrinter");
        //AOP
        before();
        printer.manyPrint();
        after();
    }

    private void before() {
        System.out.println("任务开始前");
    }

    private void after() {
        System.out.println("任务开始后");
    }
}
