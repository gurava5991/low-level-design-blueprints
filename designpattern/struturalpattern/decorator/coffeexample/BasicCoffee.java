package designpattern.struturalpattern.decorator.coffeexample;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
