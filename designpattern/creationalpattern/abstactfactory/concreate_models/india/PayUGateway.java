package designpattern.creationalpattern.abstactfactory.concreate_models.india;

import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;

public class PayUGateway  implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayU payment for amount: " + amount);
    }

}
