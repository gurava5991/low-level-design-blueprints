package designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator;

import designpattern.struturalpattern.decorator.pizzaexample.Pizza;
import designpattern.struturalpattern.decorator.pizzaexample.PizzaDecorator;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    public double cost() {
        return pizza.cost() + 20.0d;
    }
}
