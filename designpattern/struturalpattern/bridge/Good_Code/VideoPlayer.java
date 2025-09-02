package designpattern.struturalpattern.bridge.Good_Code;

public abstract  class VideoPlayer {
    protected VideoQuality videoQuality;

    public  VideoPlayer(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }
    public abstract void playVideo(String title);
}
