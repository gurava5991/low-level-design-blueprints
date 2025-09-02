package designpattern.struturalpattern.bridge.Good_Code;

public class UltraHDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Streaming " + title + " in Ultra HD quality...");
    }
}
