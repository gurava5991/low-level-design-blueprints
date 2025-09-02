package designpattern.struturalpattern.composite._02Good_Code;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem {
    private String name;
    List<CartItem> items = new ArrayList<>();

    public ProductBundle(String name) {
        this.name = name;
    }
    public void addProduct(CartItem item) {
        items.add(item);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " $" + getPrice());
        for (CartItem item : items) {
            item.display(indent + "  ");
        }
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (CartItem item : items) {
            price += item.getPrice();
        }
        return price;
    }
}
