package designpattern.behaviourdesionPattern.strategy.Good_Code.Concreate_Payment_Methods;

import designpattern.behaviourdesionPattern.strategy.Good_Code.PaymentStrategy;

public class StripePayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Stripe payment");
    }
}
