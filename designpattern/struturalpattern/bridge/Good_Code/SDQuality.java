package designpattern.struturalpattern.bridge.Good_Code;

public class SDQuality implements VideoQuality {
    @Override
    public void load(String title) {
        System.out.println("Streaming to load " + title + " in SD quality...");
    }
}
