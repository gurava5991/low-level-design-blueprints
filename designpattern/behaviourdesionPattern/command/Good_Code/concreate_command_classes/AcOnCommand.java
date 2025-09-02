package designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes;

import designpattern.behaviourdesionPattern.command.Good_Code.Command;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.AC;

public class AcOnCommand implements Command {
    private AC ac;
    public AcOnCommand(AC ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }

}
