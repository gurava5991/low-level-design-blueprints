package designpattern.behaviourdesionPattern.observer.Good_Code;

import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.Subscriber;
import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.YouTubeChannel;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannelImp implements YouTubeChannel {
    List<Subscriber> subscribers = new ArrayList<>();
    private String video;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void uploadNewVideo(String video) {
        this.video = video;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(video);
        }
    }
}

