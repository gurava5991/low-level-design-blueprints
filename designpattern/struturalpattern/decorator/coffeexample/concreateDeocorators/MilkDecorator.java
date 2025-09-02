package designpattern.struturalpattern.decorator.coffeexample.concreateDeocorators;

import designpattern.struturalpattern.decorator.coffeexample.Coffee;
import designpattern.struturalpattern.decorator.coffeexample.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return coffee.cost() + 1.0;
    }
}
