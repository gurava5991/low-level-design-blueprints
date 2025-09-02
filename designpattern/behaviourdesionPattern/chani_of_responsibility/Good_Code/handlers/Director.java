package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers;

import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.Approver;

public class Director extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if(leaveDays <= 10) {
            System.out.println("Director approved leave days: " + leaveDays);
        }
        else if(nextApprover != null) {
            nextApprover.processRequest(leaveDays);
        }
        else
            System.out.println("Leave request declined.Too many days");
    }
}
