package designpattern.struturalpattern.flyweight.Good_Code;

public class TreeClient {
    public static void main(String[] args) {
        Forest forest = new Forest();
        for(int i = 0 ; i < 10 ; i++){
            forest.plantTree(i , i , "oak" , "green" , "smooth");
            forest.draw();
        }

    }
}
