package designpattern.struturalpattern.decorator.coffeexample;

import designpattern.struturalpattern.decorator.coffeexample.concreateDeocorators.MilkDecorator;
import designpattern.struturalpattern.decorator.coffeexample.concreateDeocorators.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();//10
        coffee = new WhipDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
    }
}
