package designpattern.creationalpattern.abstactfactory.concreate_factory;

import designpattern.creationalpattern.abstactfactory.concreate_models.us.StripeGateway;
import designpattern.creationalpattern.abstactfactory.concreate_models.us.PayPalGateway;
import designpattern.creationalpattern.abstactfactory.concreate_models.us.USInvoice;
import designpattern.creationalpattern.abstactfactory.interfaces.Invoice;
import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;
import designpattern.creationalpattern.abstactfactory.interfaces.RegionFactory;

public class UsFactory implements RegionFactory {
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.equals("stripe")) {
            return new StripeGateway();
        } else if (gatewayType.equals("paypal")) {
            return new PayPalGateway();
        } else {
            return null;
        }
    }

    @Override
    public Invoice createInvoice() {
        return new USInvoice();
    }
}
