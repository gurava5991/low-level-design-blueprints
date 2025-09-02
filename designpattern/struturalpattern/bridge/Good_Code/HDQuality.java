package designpattern.struturalpattern.bridge.Good_Code;

public class HDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Streaming " + title + " in HD quality...");
    }
}
