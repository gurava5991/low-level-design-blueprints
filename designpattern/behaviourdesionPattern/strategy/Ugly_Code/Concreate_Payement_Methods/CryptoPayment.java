package designpattern.behaviourdesionPattern.strategy.Ugly_Code.Concreate_Payement_Methods;

import designpattern.behaviourdesionPattern.strategy.Ugly_Code.PayementMethod;

public class CryptoPayment implements PayementMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing crypto payment");
    }
}
