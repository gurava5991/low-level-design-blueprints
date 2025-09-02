package designpattern.struturalpattern.composite._01Bad_Code;

public class Product {
    private String name;
    private  double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void display(String indent) {
        System.out.println(indent + name + " $" + price);
    }

}
