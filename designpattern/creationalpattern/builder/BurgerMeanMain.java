package designpattern.creationalpattern.builder;

public class BurgerMeanMain {
    public static void main(String[] args) {
       BurgerMeal meal = new BurgerMeal.BurgerBuilder().
               meat("chicken")
               .cheese("cheddar")
               .veggies("lettuce")
               .sauce("hot")
               .bread("white")
               .build();
        System.out.println(meal.toString());

    }

}
