package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers;

import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.Approver;

public class HR extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        System.out.println("HR: Leave request requires further discussion");
    }
}
