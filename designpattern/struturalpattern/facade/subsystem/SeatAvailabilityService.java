package designpattern.struturalpattern.facade.subsystem;

public class SeatAvailabilityService {
    public boolean reserveSeat(String theatreId, String movieId, int seatCount) {
        System.out.println("Reserving " + seatCount + " seat(s) at " + theatreId + " for " + movieId);
        return true;
    }
}
