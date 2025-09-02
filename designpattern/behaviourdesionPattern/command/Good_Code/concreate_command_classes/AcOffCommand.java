package designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes;

import designpattern.behaviourdesionPattern.command.Good_Code.Command;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.AC;

public class AcOffCommand implements Command {
    private AC ac;

    public AcOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
