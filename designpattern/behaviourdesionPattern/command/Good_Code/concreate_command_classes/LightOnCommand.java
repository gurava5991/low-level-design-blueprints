package designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes;

import designpattern.behaviourdesionPattern.command.Good_Code.Command;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.Light;

public class LightOnCommand implements Command {
    private   Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
