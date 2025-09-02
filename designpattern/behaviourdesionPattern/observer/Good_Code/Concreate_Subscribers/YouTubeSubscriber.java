package designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers;

import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.Subscriber;

public class YouTubeSubscriber implements Subscriber {
    private String name;
    public YouTubeSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String video) {
        System.out.println(name + " is watching the video: " + video);
    }
}
