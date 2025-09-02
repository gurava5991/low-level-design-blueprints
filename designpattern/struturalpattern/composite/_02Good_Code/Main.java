package designpattern.struturalpattern.composite._02Good_Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartItem book = new Product("Atomic Habits", 499);
        CartItem phone = new Product("iPhone 15", 79999);
        CartItem earbuds = new Product("AirPods", 15999);
        CartItem charger = new Product("20W Charger", 1999);

        //iphoneCombo
        ProductBundle iphoneCombo = new ProductBundle("iPhone Combo Pack");
        iphoneCombo.addProduct(phone);
        iphoneCombo.addProduct(earbuds);
        iphoneCombo.addProduct(charger);

        //collegeKit
        ProductBundle schoolKit = new ProductBundle("college Kit");
        schoolKit.addProduct(book);
        schoolKit.addProduct(iphoneCombo);
        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        System.out.println("Cart Items:");
        for(CartItem item : cart)
            item.display("  ");
        System.out.println("Total: $" + cart.stream().mapToDouble(CartItem::getPrice).sum());
    }
}

