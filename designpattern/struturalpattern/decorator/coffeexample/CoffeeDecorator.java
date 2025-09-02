package designpattern.struturalpattern.decorator.coffeexample;

public abstract  class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
