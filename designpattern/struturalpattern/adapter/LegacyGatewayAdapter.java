package designpattern.struturalpattern.adapter;

public class LegacyGatewayAdapter implements PaymentGateway {
    private LegacyGateway legacyGateway;

    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public String getTransactionId() {
        return String.valueOf(legacyGateway.getTransactionReference());

    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Legacy gateway processing payment of $" + amount + " in " + currency);
        legacyGateway.executePayment(amount, currency);
        System.out.println("Payment successful. Transaction reference: " + legacyGateway.getTransactionReference());
    }

    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateway.checkPaymentStatus();
    }
}
