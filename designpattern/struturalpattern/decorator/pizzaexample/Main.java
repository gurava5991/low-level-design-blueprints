package designpattern.struturalpattern.decorator.pizzaexample;

import designpattern.struturalpattern.decorator.pizzaexample.concreateclasses.MargheritaPizza;
import designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator.ExtraCheese;
import designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator.Olives;
import designpattern.struturalpattern.decorator.pizzaexample.concreatedecorator.StuffedCrust;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        pizza = new ExtraCheese(pizza);
        pizza = new Olives(pizza);
        pizza = new StuffedCrust(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
