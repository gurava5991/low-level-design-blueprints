package designpattern.struturalpattern.decorator.pizzaexample.concreateclasses;

import designpattern.struturalpattern.decorator.pizzaexample.Pizza;

public class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double cost() {
        return 250.0d;
    }
}
