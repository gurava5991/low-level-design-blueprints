package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers;

import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.Approver;

public class Manager extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if (leaveDays <= 5) {
            System.out.println("Manager approved leave days: " + leaveDays);
        } else {
            this.nextApprover.processRequest(leaveDays);
        }
    }
}
