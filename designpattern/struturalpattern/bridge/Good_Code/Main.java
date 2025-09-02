package designpattern.struturalpattern.bridge.Good_Code;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new MobilePlayer(new UltraHDQuality());
        videoPlayer.playVideo("Interstellar");

        videoPlayer = new WebPlayer(new UltraHDQuality());
        videoPlayer.playVideo("Avatar");

    }
}
