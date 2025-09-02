package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code;

import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers.Director;
import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers.HR;
import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers.Manager;
import designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code.handlers.SuperVisor;

public class LeaveRequestChainDemo {
    public static void main(String[] args) {
        Approver superVisor = new SuperVisor();
        Approver manager = new Manager();
        Approver director = new Director();
        HR hr = new HR();

        superVisor.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(hr);

        int leaveDays = 5;
        System.out.println("request leave days: " + leaveDays);
        superVisor.processRequest(leaveDays);
    }
}
