package org.example.principle.lsp;

/**
 * @author Castle
 * @Date 2021/5/17 9:08
 */
public class LspImprove {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println("6和3的和为：" + a.func11(6, 3));
        B1 b = new B1();
        System.out.println("6和3的差:" + b.func11(6, 3));
        System.out.println("6和3的差再加9：" + b.func22(6, 3));
    }
}

class Base {

}

class A1 extends Base {
    public int func11(int num1, int num2) {
        return num1 + num2;
    }
}

class B1 extends Base {

    A1 a1 = new A1();

    //此时B已经不会再去重写A中的方法
    public int func11(int num1, int num2) {
        return num1 - num2;
    }

    public int func22(int num1, int num2) {
        return num1 - num2 + 9;
    }

    public int func33(int num1, int num2) {
        return a1.func11(num1, num2);
    }
}