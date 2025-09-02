package designpattern.behaviourdesionPattern.strategy.Ugly_Code;

import designpattern.behaviourdesionPattern.strategy.Ugly_Code.Concreate_Payement_Methods.CreditCardPayment;
import designpattern.behaviourdesionPattern.strategy.Ugly_Code.Concreate_Payement_Methods.CryptoPayment;
import designpattern.behaviourdesionPattern.strategy.Ugly_Code.Concreate_Payement_Methods.UPIPayment;

public class PaymentProcessor{
    // This method processes payment based on the payment method type
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            CreditCardPayment creditCard = new CreditCardPayment();
            creditCard.processPayment(); // Process Credit Card payment
        }  else if (paymentMethod.equals("Crypto")) {
            CryptoPayment crypto = new CryptoPayment();
            crypto.processPayment(); // Process Crypto payment
        } else if (paymentMethod.equals("upi")) {
            UPIPayment upi = new UPIPayment();
            upi.processPayment(); // Process UPI payment
        }  else {
            System.out.println("Payment method not supported.");
        }
    }
}
