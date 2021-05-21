package org.example.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Castle
 * @Date 2021/5/21 9:00
 */
public class ProxyFactory{
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //AOP
                System.out.println("JDK代理前");
                if (method.getName().equals("manyPrint")) {
                    System.out.println("开始了一个很繁重的任务");
                }
                Object result = method.invoke(target, args);

                System.out.println("JDK代理后");
                return result;
            }
        });
    }
}
