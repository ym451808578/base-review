package org.example.pattern.template;

/**
 * @author Castle
 * @Date 2021/5/21 11:20
 */
public class Client {
    public static void main(String[] args) {
        AudiTemplate audiA4 = new AudiComfortable();
        AudiTemplate audiA6 = new AudiLuxury();
        System.out.println("***奥迪A4启动***");
        audiA4.startTemplate();
        System.out.println("***奥迪A6启动***");
        audiA6.startTemplate();
    }
}
