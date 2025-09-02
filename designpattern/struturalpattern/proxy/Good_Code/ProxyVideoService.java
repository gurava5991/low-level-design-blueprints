package designpattern.struturalpattern.proxy.Good_Code;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoService implements VideoServiceInterface{
    private VideoService videoService;
    private Map<String , String  > cachedVideos = new HashMap<>();
    private Map<String , Integer> userCount = new HashMap<>();

    public ProxyVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    @Override
    public void playVideo(String userType, String videoName) {
        //check user permission
        if (!userType.equals("premium") && videoName.startsWith("Premium")) {
            System.out.println(
                    "Access denied: Premium video requires a premium account.");
            return;
        }
        //Limit request
        userCount.put(userType , userCount.getOrDefault(userType , 0) + 1); //Count
        if (userCount.get(userType) > 5) {
            System.out.println("Access denied: User has reached the limit.");
            return;
        }
        //check cache
        if (cachedVideos.containsKey(videoName)) {
            System.out.println("Playing video from cache: " + videoName);
            return;
        }
        else {
            videoService.playVideo(userType , videoName);
            cachedVideos.put(videoName , videoName);
            System.out.println("playing video from server: " + videoName);
        }

    }
}
