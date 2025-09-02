package designpattern.behaviourdesionPattern.template;

public class Tea extends BeverageTemplate {
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}
