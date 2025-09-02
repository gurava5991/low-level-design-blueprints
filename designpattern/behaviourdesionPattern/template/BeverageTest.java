package designpattern.behaviourdesionPattern.template;

public class BeverageTest {
    public static void main(String[] args) {
        BeverageTemplate tea = new Tea();
        tea.prepareRecipe();

        System.out.println("---");

        BeverageTemplate coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
