package desingprincipals.solid._01_SRP.Bad_Code;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("banny" , "b@b.com");
        emp.calculateSalary();
        emp.saveToDatabase();
        emp.sendWelcomeEmail();
    }
}
