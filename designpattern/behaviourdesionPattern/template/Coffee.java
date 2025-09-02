package designpattern.behaviourdesionPattern.template;

public class Coffee extends BeverageTemplate{
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
