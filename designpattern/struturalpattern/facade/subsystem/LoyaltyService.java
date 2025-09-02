package designpattern.struturalpattern.facade.subsystem;

public class LoyaltyService {
    public void addPoints(String userId, int points) {
        System.out.println("Adding " + points + " loyalty points to user " + userId);
    }
}
