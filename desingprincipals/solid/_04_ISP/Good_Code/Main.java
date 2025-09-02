package desingprincipals.solid._04_ISP.Good_Code;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.acceptRide();
        driver.trackEarnings();
        driver.ratePassenger();
        Rider rider = new Rider();
        rider.bookRide();
        rider.rateDriver();
    }
}
