package designpattern.struturalpattern.adapter;

public class LegacyGateway {
    private long transactionReference;
    private boolean isPaymentSuccessful;

    public void executePayment(double amount, String currency) {
        System.out.println("Executing payment of $" + amount + " in " + currency);
        // perform payment processing

        transactionReference = System.nanoTime();
        isPaymentSuccessful = true;
        System.out.println("Payment successful. Transaction reference: " + transactionReference);
    }
    public boolean checkPaymentStatus() {
        System.out.println("Checking payment status for transaction reference: " + transactionReference);
        return isPaymentSuccessful;
    }
    public long getTransactionReference() {
        return transactionReference;
    }
}
