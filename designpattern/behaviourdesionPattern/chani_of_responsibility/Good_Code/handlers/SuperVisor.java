package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers;

import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.Approver;

public class SuperVisor extends Approver {
    @Override
    public void processRequest(int leaveDays) {
        if (leaveDays <= 3) {
            System.out.println("SuperVisor approved leave days: " + leaveDays);
        } else {
            this.nextApprover.processRequest(leaveDays);
        }
    }
}
