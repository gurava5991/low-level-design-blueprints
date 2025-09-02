package designpattern.struturalpattern.facade;

import designpattern.struturalpattern.facade.facade_interface.BookingFacade;

public class Main {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookTicket("user1", "Inception", "Bangalore", 2);
    }
}
