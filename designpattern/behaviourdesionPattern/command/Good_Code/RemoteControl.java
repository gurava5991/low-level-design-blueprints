package designpattern.behaviourdesionPattern.command.Good_Code;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoteControl {

    private  Deque<Command> commandQueue = new ArrayDeque<>();
    private Command[] commands = new Command[4];

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if(commands[slot] == null) return;
        commands[slot].execute();
        commandQueue.push(commands[slot]);
    }
    public void undo() {
        if(commandQueue.isEmpty()) return;
        commandQueue.pop().undo();
    }
}
