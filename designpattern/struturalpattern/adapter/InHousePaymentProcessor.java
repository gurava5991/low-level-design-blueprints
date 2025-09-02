package designpattern.struturalpattern.adapter;

public class InHousePaymentProcessor implements PaymentGateway {
    private String transactionId;
    private boolean isPaymentSuccessful;

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("In-house payment processor processing payment of $" + amount + " in " + currency);
        // perform in-house payment processing

        transactionId = "TXN_" + System.currentTimeMillis();
        isPaymentSuccessful = true;
        System.out.println("In-house payment successful. Transaction ID: " + transactionId);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
