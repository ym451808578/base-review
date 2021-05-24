package org.example.pattern.command;

/**
 * @author Castle
 * @Date 2021/5/24 9:41
 */
public class Client {
    public static void main(String[] args) {
        ICommand command = new BackendAddFunctionCommand("用户管理");
        ICommand command1 = new BackendAddFunctionCommand("内容管理");
        CMInvoker cm = new CMInvoker();
        cm.setCommand(command);
        cm.action();
        cm.setCommand(command1);
        cm.action();
        cm.undo();
        cm.undo();
    }
}
