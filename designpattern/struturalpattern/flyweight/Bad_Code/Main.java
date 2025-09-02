package designpattern.struturalpattern.flyweight.Bad_Code;
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < 1000000; i++) {
            forest.plantTree(i, i, "oak", "green", "smooth");
            forest.draw();
        }
        System.out.println("Planted 1m trees.");
    }
}
