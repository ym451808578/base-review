package org.example.pattern.command;

/**
 * @author Castle
 * @Date 2021/5/24 8:59
 */
public class BackendReceiver {

    public void addFunction(String name) {
        System.out.println("后端新增了功能:" + name);
    }

    public void undoAddFunction(String name) {
        System.out.println("后端取消了新增功能:" + name);
    }
}
