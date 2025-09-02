package designpattern.behaviourdesionPattern.chani_of_responsibility.Bad_Code;

public class LeaveRequest {
    public static void main(String[] args) {
        int leaveDays = 12;
        if (leaveDays > 0) {
            if (leaveDays <= 3) {
                System.out.println("Supervisor approved the leave.");
            } else {
                if (leaveDays <= 7) {
                    System.out.println("Manager approved the leave.");
                } else {
                    if (leaveDays <= 14) {
                        System.out.println("Director approved the leave.");
                    } else {
                        System.out.println("Leave request denied. Too many days!");
                    }
                }
            }
        } else {
            System.out.println("Invalid leave request.");
        }
    }
}
