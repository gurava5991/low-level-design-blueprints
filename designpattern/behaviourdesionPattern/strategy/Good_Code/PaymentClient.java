package designpattern.behaviourdesionPattern.strategy.Good_Code;

import designpattern.behaviourdesionPattern.strategy.Good_Code.Concreate_Payment_Methods.CreditCardPayment;
import designpattern.behaviourdesionPattern.strategy.Good_Code.Concreate_Payment_Methods.CryptoPayment;
import designpattern.behaviourdesionPattern.strategy.Good_Code.Concreate_Payment_Methods.PayPalPayment;
import designpattern.behaviourdesionPattern.strategy.Good_Code.Concreate_Payment_Methods.StripePayment;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy stripePayment = new StripePayment();
        PaymentStrategy paypalPayment = new PayPalPayment();
        PaymentStrategy cryptoPayment = new CryptoPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(stripePayment);
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStrategy(paypalPayment);
        paymentProcessor.processPayment();
    }
}
