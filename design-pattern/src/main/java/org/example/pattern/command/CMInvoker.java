package org.example.pattern.command;

import java.util.Stack;

/**
 * @author Castle
 * @Date 2021/5/24 9:11
 */
public class CMInvoker {

    private ICommand command;

    private Stack<ICommand> addCommands = new Stack();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void action() {
        addCommands.push(command);
        this.command.execute();
    }

    public void undo() {
        ICommand undoCommand = addCommands.pop();
        undoCommand.unExecute();
    }
}
