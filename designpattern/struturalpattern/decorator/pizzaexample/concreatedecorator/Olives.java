package designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator;

import designpattern.struturalpattern.decorator.pizzaexample.Pizza;
import designpattern.struturalpattern.decorator.pizzaexample.PizzaDecorator;

public class Olives extends PizzaDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return pizza.cost() + 10.0d;
    }

}
