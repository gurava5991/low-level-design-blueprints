package designpattern.struturalpattern.bridge.Good_Code;

public class WebPlayer extends VideoPlayer {
    public WebPlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }
    @Override
    public void playVideo(String title) {
        videoQuality.load(title);

    }
}
