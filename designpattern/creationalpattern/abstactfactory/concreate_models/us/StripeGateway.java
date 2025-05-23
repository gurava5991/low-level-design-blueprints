package designpattern.creationalpattern.abstactfactory.concreate_models.us;

import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;

public class StripeGateway implements  PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment for amount: " + amount);
    }
}
