package designpattern.creationalpattern.builder;

public class BurgerMeal {
    //mandatory fields
    private String bread;
    private String meat;

    //optional fields
    private String cheese;
    private String veggies;
    private String sauce;

    BurgerMeal(BurgerBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.veggies = builder.veggies;
        this.sauce = builder.sauce;
    }
    public String toString() {
        return "BurgerMeal{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", veggies='" + veggies + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
    public static class BurgerBuilder {
        //mandatory fields
        private String bread;
        private String meat;
        //optional fields
        private String cheese;
        private String veggies;
        private String sauce;

        public BurgerBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public BurgerBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }
        public BurgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
        public BurgerBuilder veggies(String veggies) {
            this.veggies = veggies;
            return this;
        }
        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }
}
