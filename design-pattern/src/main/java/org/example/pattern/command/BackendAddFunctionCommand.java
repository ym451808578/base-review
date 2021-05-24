package org.example.pattern.command;

/**
 * @author Castle
 * @Date 2021/5/24 9:13
 */
public class BackendAddFunctionCommand implements ICommand {

    private BackendReceiver backendReceiver = new BackendReceiver();
    private String funcName;

    public BackendAddFunctionCommand(String funcName) {
        this.funcName = funcName;
    }

    @Override
    public void execute() {
        backendReceiver.addFunction(funcName);
    }

    @Override
    public void unExecute() {
        backendReceiver.undoAddFunction(funcName);
    }
}
