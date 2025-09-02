package designpattern.struturalpattern.composite._01Bad_Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Individual Items
        Product book = new Product("Book", 500);
        Product headphones = new Product("Headphones", 1500);
        Product charger = new Product("Charger", 800);
        Product pen = new Product("Pen", 20);
        Product notebook = new Product("Notebook", 60);

        // Bundle: Iphone Combo
        ProductBundle iphoneCombo = new ProductBundle("iPhone Combo Pack");
        iphoneCombo.addProduct(headphones);
        iphoneCombo.addProduct(charger);

        // Bundle: School Kit
        ProductBundle schoolKit = new ProductBundle("School Kit");
        schoolKit.addProduct(pen);
        schoolKit.addProduct(notebook);

        // Add to cart logic
        List<Object> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        System.out.println("Cart Items:");

        double total = 0;
        for (Object item : cart) {
            if (item instanceof Product) {
                total += ((Product) item).getPrice();
            } else if (item instanceof ProductBundle) {
                total += ((ProductBundle) item).getPrice();
            }
        }

        System.out.println("Total Price: $" + total);


    }
}
