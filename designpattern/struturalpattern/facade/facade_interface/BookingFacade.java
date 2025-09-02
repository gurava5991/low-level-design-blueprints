package designpattern.struturalpattern.facade.facade_interface;

import designpattern.struturalpattern.facade.subsystem.*;

public class BookingFacade {
    private MovieCatalogService movieService = new MovieCatalogService();
    private TheatreService theatreService = new TheatreService();
    private SeatAvailabilityService seatService = new SeatAvailabilityService();
    private PaymentGateway paymentGateway = new PaymentGateway();
    private NotificationService notificationService = new NotificationService();
    private LoyaltyService loyaltyService = new LoyaltyService();


    public void bookTicket(String userId, String movieId, String userLocation, int seatCount){
        if(!movieService.isMovieAvailable(movieId)) return;
        String theatreId = theatreService.findNearestTheatre(movieId, userLocation);
        if(!seatService.reserveSeat(theatreId, movieId, seatCount)) return;
        if(!paymentGateway.processPayment(userId, seatCount)) return;
        notificationService.sendEmail(userId, "Your ticket has been booked for " + movieId + " at " + theatreId);
        loyaltyService.addPoints(userId, 5);
    }

}
