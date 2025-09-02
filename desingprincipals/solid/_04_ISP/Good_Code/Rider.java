package desingprincipals.solid._04_ISP.Good_Code;

public class Rider implements RiderInterface {

    @Override
    public void bookRide() {
        System.out.println("Rider is booking a ride.");
    }

    @Override
    public void rateDriver() {
        System.out.println("Rider is rating the driver.");
    }
}
