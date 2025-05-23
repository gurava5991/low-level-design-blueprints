package designpattern.creationalpattern.abstactfactory.interfaces;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(String gatewayType);
    Invoice createInvoice();
}
