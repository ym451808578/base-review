package org.example.pattern.memento;

/**
 * @author Castle
 * @Date 2021/5/25 8:53
 */
public class Client {
    public static void main(String[] args) {
        Originator oraBoy = new Originator("心情一般");
        //当前状态进行备份
        Memento memento = oraBoy.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);
        System.out.println("男孩去追求女孩，成功了");
        oraBoy.setState("心情很好");
        System.out.println("男孩当前的心情：" + oraBoy.getState());
        System.out.println("男孩后悔了，分手了");
        oraBoy.restoreMemento(careTaker.getMemento());
        System.out.println("男孩现在的心情:" + oraBoy.getState());
    }
}
