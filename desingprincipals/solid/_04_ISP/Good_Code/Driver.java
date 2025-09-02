package desingprincipals.solid._04_ISP.Good_Code;

public class Driver implements DriverInterface {
    @Override
    public void acceptRide() {
        System.out.println("Driver is accepting a ride.");
    }

    @Override
    public void trackEarnings() {
        System.out.println("Driver is tracking earnings.");
    }

    @Override
    public void ratePassenger() {
        System.out.println("Driver is rating a passenger.");
    }
}
