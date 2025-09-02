package designpattern.struturalpattern.proxy.Good_Code;

public class VideoService implements VideoServiceInterface{
    @Override
    public void playVideo(String userType, String videoName) {
        System.out.println("Playing " + videoName + " for " + userType);
    }
}
