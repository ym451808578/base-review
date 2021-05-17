package org.example.pattern.singleton;

/**
 * 饿汉式
 *
 * @author Castle
 * @Date 2021/5/17 15:04
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1 == singleton2);

    }
}

enum Singleton {
    INSTANCE;
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
//class Singleton {
//    /**
//     * 构造器私有化，使得外部无法new
//     */
//    private Singleton() {
//    }
//
//    /**
//     * 在内部实例化
//     */
//    private static final Singleton SINGLETON = new Singleton();
//
//    /**
//     * 提供一个公有的静态方法，返回实例
//     */
//    public static Singleton getInstance() {
//        return SINGLETON;
//    }
//}

//class Singleton{
//    private Singleton(){
//
//    }
//
//    private static Singleton singleton;
//
//    static {
//        singleton=new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}

//class Singleton {
//
//    private Singleton() {
//    }
//
//    private static class SingletonInstance {
//        private static final Singleton SINGLETON = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//
//        return SingletonInstance.SINGLETON;
//    }
//}

