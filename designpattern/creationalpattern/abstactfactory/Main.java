package designpattern.creationalpattern.abstactfactory;

import designpattern.creationalpattern.abstactfactory.concreate_factory.IndianFactory;
import designpattern.creationalpattern.abstactfactory.concreate_factory.UsFactory;

public class Main {
    public static void main(String[] args) {
        CheckOutService indianService = new CheckOutService(new IndianFactory(), "razorpay");

        indianService.checkout(1000.0);

        System.out.println("--");

        CheckOutService usService = new CheckOutService(new UsFactory(), "stripe");
        usService.checkout(2000.0);

    }
}
