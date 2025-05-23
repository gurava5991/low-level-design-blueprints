package designpattern.creationalpattern.abstactfactory.concreate_models.us;

import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment for amount: " + amount);
    }
}
