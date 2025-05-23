package designpattern.creationalpattern.abstactfactory.concreate_models.india;

import designpattern.creationalpattern.abstactfactory.interfaces.Invoice;

public class GSTInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating GST Invoice");
    }
}
