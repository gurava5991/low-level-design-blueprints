package designpattern.struturalpattern.adapter;

public interface PaymentGateway {
    void processPayment(double amount, String currency);
    boolean isPaymentSuccessful();
    String getTransactionId();
}
