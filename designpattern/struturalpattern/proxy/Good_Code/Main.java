package designpattern.struturalpattern.proxy.Good_Code;

public class Main {
    public static void main(String[] args) {
        VideoService videoService = new VideoService();
        ProxyVideoService proxyVideoService = new ProxyVideoService(videoService);
        proxyVideoService.playVideo("free", "Free Video 1");
        proxyVideoService.playVideo("premium", "Premium Video 1");
        proxyVideoService.playVideo("guest", "Video 1");

        for(int i = 0 ; i < 10 ; i++){
            proxyVideoService.playVideo("guest", "Video " + i);
        }


    }
}
