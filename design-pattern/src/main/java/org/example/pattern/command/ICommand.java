package org.example.pattern.command;

/**
 * @author Castle
 * @Date 2021/5/24 8:37
 */
public interface ICommand {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void unExecute();
}
