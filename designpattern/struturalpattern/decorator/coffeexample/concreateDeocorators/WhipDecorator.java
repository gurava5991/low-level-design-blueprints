package designpattern.struturalpattern.decorator.coffeexample.concreateDeocorators;

import designpattern.struturalpattern.decorator.coffeexample.Coffee;
import designpattern.struturalpattern.decorator.coffeexample.CoffeeDecorator;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return coffee.cost() + 5.0;
    }
}
