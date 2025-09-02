package designpattern.struturalpattern.composite._01Bad_Code;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle {
    private String name;
    private List<Product> products = new ArrayList<>(); // List<Product>

    public ProductBundle(String name) {
        this.name = name;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public double getPrice() {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice();
        }
        return price;
    }
    public void display(String indent) {
        System.out.println(indent + name + " $" + getPrice());
        for (Product product : products) {
            product.display(indent + "  ");
        }
    }
}
