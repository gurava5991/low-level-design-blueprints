package designpattern.struturalpattern.facade.subsystem;

public class NotificationService {
    public void sendEmail(String userId, String message) {
        System.out.println("Sending email to " + userId + ": " + message);
    }
}
