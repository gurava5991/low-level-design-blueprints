package designpattern.creationalpattern.abstactfactory;

import designpattern.creationalpattern.abstactfactory.interfaces.Invoice;
import designpattern.creationalpattern.abstactfactory.interfaces.PaymentGateway;
import designpattern.creationalpattern.abstactfactory.interfaces.RegionFactory;

public class CheckOutService {
    private PaymentGateway paymentGateway;
    private Invoice invoice;
    private String gatewayType;

    public CheckOutService(RegionFactory regionFactory, String gatewayType) {
        this.gatewayType = gatewayType;
        this.paymentGateway = regionFactory.createPaymentGateway(gatewayType);
        this.invoice = regionFactory.createInvoice();
    }

    public void checkout(double amount) {
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
