package designpattern.behaviourdesionPattern.chani_of_responsibility.Good_Code;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(int leaveDays);
}
