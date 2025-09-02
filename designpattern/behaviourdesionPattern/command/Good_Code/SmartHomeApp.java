package designpattern.behaviourdesionPattern.command.Good_Code;

import designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes.LightOffCommand;
import designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes.LightOnCommand;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.Light;
import designpattern.behaviourdesionPattern.command.Good_Code.receivers.AC;
import designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes.AcOffCommand;
import designpattern.behaviourdesionPattern.command.Good_Code.concreate_command_classes.AcOnCommand;

public class SmartHomeApp {
    public static void main(String[] args) {
        //Receiver
        Light light = new Light();
        AC ac = new AC();

        //Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        AcOnCommand acOnCommand = new AcOnCommand(ac);
        AcOffCommand acOffCommand = new AcOffCommand(ac);

        //Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0 , lightOnCommand);
        remoteControl.setCommand(1 , lightOffCommand);
        remoteControl.setCommand(2 , acOnCommand);
        remoteControl.setCommand(3 , acOffCommand);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);
        remoteControl.undo();


    }
}
