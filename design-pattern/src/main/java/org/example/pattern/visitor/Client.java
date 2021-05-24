package org.example.pattern.visitor;

/**
 * @author Castle
 * @Date 2021/5/24 11:34
 */
public class Client {
    public static void main(String[] args) {
        Report report = new Report();
        report.report();
        IVisitor CTO = new CTOVisitor();
        IVisitor CFO = new CFOVisitor();
        System.out.println("***CTO看报表***");
        report.show(CTO);
        System.out.println("***CFO看报表***");
        report.show(CFO);
    }
}
