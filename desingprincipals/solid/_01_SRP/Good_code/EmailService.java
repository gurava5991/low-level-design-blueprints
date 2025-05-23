package desingprincipals.solid._01_SRP.Good_code;

public class EmailService {
    public void sendWelcomeEmail(Employee emp) {
        System.out.println("Welcome email sent to " + emp.getEmail());
    }
}
