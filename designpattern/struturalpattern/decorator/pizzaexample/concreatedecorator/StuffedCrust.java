package designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator;

import designpattern.struturalpattern.decorator.pizzaexample.Pizza;
import designpattern.struturalpattern.decorator.pizzaexample.PizzaDecorator;

public class StuffedCrust extends PizzaDecorator {
    public StuffedCrust(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Stuffed Crust";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.0d;
    }
}
