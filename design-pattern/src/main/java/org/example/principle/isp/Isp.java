package org.example.principle.isp;

/**
 * @author 45180
 */
public class Isp {

    public static void main(String[] args) {
        A1 a = new A1();
        a.denpend1(new B1());
        a.denpend2(new B1());
        a.denpend3(new B1());
        C1 c = new C1();
        c.denpend1(new D1());
        c.denpend4(new D1());
        c.denpend5(new D1());
    }
}


interface Interface11 {
    void operation1();
}

interface Interface22 {
    void operation2();

    void operation3();

}

interface Interface33 {
    void operation4();

    void operation5();

}

class B1 implements Interface11, Interface22 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

}

class D1 implements Interface11, Interface33 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A1 {
    public void denpend1(Interface11 i) {
        i.operation1();
    }

    public void denpend2(Interface22 i) {
        i.operation2();
    }

    public void denpend3(Interface22 i) {
        i.operation3();
    }
}

class C1 {
    public void denpend1(Interface11 i) {
        i.operation1();
    }

    public void denpend4(Interface33 i) {
        i.operation4();
    }

    public void denpend5(Interface33 i) {
        i.operation5();
    }
}