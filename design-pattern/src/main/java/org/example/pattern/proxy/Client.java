package org.example.pattern.proxy;

/**
 * @author Castle
 * @Date 2021/5/21 8:41
 */
public class Client {
    public static void main(String[] args) {
        PrinterProxy printerProxy = new PrinterProxy("HP");
        printerProxy.print("一页纸");
        printerProxy.manyPrint();
    }
}
