package designpattern.struturalpattern.bridge.Good_Code;

public class MobilePlayer extends VideoPlayer {
    public MobilePlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }
    @Override
    public void playVideo(String title) {
        System.out.println("Playing " + title + " on mobile player");
    }
}
