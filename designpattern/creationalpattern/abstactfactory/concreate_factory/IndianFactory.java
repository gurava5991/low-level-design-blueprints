package designpattern.creationalpattern.abstactfactory.concreate_factory;

import designpattern.creationalpattern.abstactfactory.concreate_models.india.GSTInvoice;
import designpattern.creationalpattern.abstactfactory.concreate_models.india.PayUGateway;
import designpattern.creationalpattern.abstactfactory.concreate_models.india.RazorpayGateway;
import designpattern.creationalpattern.abstactfactory.interfaces.Invoice;
import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;
import designpattern.creationalpattern.abstactfactory.interfaces.RegionFactory;

public class IndianFactory implements RegionFactory {
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.equals("razorpay")) {
            return new RazorpayGateway();
        } else if (gatewayType.equals("payu")) {
            return new PayUGateway();
        } else {
            return null;
        }
    }

    @Override
    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
