package designpattern.struturalpattern.adapter;

public class CheckoutService {

    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount , String currency) {
        System.out.println("Checkout service processing payment of $" + amount + " in " + currency);
        paymentGateway.processPayment(amount, currency);
        if (paymentGateway.isPaymentSuccessful()) {
            System.out.println("Payment successful. Transaction ID: " + paymentGateway.getTransactionId());
        } else {
            System.out.println("Payment failed.");
        }
    }
}
