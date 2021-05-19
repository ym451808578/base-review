package org.example.pattern.composite;

/**
 * @author Castle
 * @Date 2021/5/19 16:14
 */
public class Client {
    public static void main(String[] args) {
        Component CEO = new Manager("Z3", "CEO");
        Component devDep = new Manager("L4", "devDep");
        Component saleDep = new Manager("W5", "saleDep");
        CEO.add(devDep);
        CEO.add(saleDep);
        Component dev1 = new Staff("dev1", "dev");
        Component dev2 = new Staff("dev2", "dev");
        devDep.add(dev1);
        devDep.add(dev2);
        Component sale1 = new Staff("sale1", "sale");
        Component sale2 = new Staff("sale2", "sale");
        saleDep.add(sale1);
        saleDep.add(sale2);
        System.out.println("*********按部门遍历CEO下辖的员工********");
        CEO.print();
        System.out.println("******开始调整sale1到开发部*****");
        saleDep.remove(sale1);
        sale1.setPos("dev");
        devDep.add(sale1);
        System.out.println("*********按部门遍历CEO下辖的员工********");
        CEO.print();
    }
}
