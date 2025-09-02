package designpattern.struturalpattern.adapter;

public class ECommerceAppV1 {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new InHousePaymentProcessor());
        checkoutService.checkout(1000.0, "USD");

    }
}
