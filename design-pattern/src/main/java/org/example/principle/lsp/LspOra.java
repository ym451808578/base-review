package org.example.principle.lsp;

/**
 * @author Castle
 * @Date 2021/5/17 8:48
 */
public class LspOra {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("6和3的和为：" + a.func1(6, 3));
        B b = new B();
        System.out.println("6和3的和:" + b.func1(6, 3));
        System.out.println("6和3的和再加9：" + b.func2(6, 3));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
}

class B extends A {
    @Override
    public int func1(int num1, int num2) {
        return num1 - num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}
