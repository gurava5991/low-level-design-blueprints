package designpattern.struturalpattern.decorator.pizzaexample.concreateclasses;

import designpattern.struturalpattern.decorator.pizzaexample.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public double cost() {
        return 200.0d;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
