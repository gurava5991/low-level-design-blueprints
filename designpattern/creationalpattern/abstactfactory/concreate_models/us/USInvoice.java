package designpattern.creationalpattern.abstactfactory.concreate_models.us;

import designpattern.creationalpattern.abstactfactory.interfaces.Invoice;

public class USInvoice implements Invoice {

    @Override
    public void generateInvoice() {
        System.out.println("Generating US Invoice");
    }
}
