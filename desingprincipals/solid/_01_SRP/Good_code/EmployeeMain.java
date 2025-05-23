package desingprincipals.solid._01_SRP.Good_code;

public class EmployeeMain {
    public static void main(String[] args) {
        //A class should have only one reason to change, meaning it should do only one job.
        Employee emp = new Employee("banny" , "b@b.com");
        EmployeeRepository repo = new EmployeeRepository();
        SalaryCalculator cal = new SalaryCalculator();
        EmailService emailService = new EmailService();
        repo.save(emp);
        cal.calculateSalary(emp);
        emailService.sendWelcomeEmail(emp);
    }
}
