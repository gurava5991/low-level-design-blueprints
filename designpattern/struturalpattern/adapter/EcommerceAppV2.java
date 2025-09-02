package designpattern.struturalpattern.adapter;

public class EcommerceAppV2 {
    public static void main(String[] args) {
        CheckoutService inHouseCheckoutService = new CheckoutService(new InHousePaymentProcessor());
        inHouseCheckoutService.checkout(1000.0, "USD");

        System.out.println("------");
        CheckoutService legacyCheckoutService = new CheckoutService(new LegacyGatewayAdapter(new LegacyGateway()));
        legacyCheckoutService.checkout(1000.0, "USD");

    }
}
