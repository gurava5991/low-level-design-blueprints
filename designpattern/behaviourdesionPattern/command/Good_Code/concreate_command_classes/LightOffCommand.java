package designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes;

import designpattern.behaviourdesionPattern.command.Good_Code.Command;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.Light;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
