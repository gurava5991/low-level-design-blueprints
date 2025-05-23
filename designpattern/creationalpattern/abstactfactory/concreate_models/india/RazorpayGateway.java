package designpattern.creationalpattern.abstactfactory.concreate_models.india;

import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment for amount: " + amount);
    }
}
