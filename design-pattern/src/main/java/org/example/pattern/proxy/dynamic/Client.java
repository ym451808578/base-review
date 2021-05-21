package org.example.pattern.proxy.dynamic;

/**
 * @author Castle
 * @Date 2021/5/21 9:04
 */
public class Client {
    public static void main(String[] args) {
        IPrint print = new Printer("HP");
        IPrint proxyPrint = (IPrint) new ProxyFactory(print).getProxyInstance();
        proxyPrint.print();
        proxyPrint.manyPrint();
    }
}
