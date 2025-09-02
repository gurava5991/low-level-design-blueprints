package designpattern.behaviourdesionPattern.observer.Good_Code;


import designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers.EmailSubscriber;
import designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers.PushNotificationSubscriber;
import designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers.YouTubeSubscriber;
import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.Subscriber;

public class Main {
    public static void main(String[] args) {
        YouTubeChannelImp youtubeChannel = new YouTubeChannelImp();
        Subscriber youTubeSubscriber1 = new YouTubeSubscriber("Subscriber 1");
        Subscriber youTubeSubscriber2 = new YouTubeSubscriber("Subscriber 2");
        Subscriber youTubeSubscriber3 = new YouTubeSubscriber("Subscriber 3");

        Subscriber emailSubscriber1 = new EmailSubscriber("Email Subscriber 1");
        Subscriber emailSubscriber2 = new EmailSubscriber("Email Subscriber 2");
        Subscriber emailSubscriber3 = new EmailSubscriber("Email Subscriber 3");

        Subscriber pushNotificationSubscriber1 = new PushNotificationSubscriber("Push Notification Subscriber 1");
        Subscriber pushNotificationSubscriber2 = new PushNotificationSubscriber("Push Notification Subscriber 2");
        youtubeChannel.addSubscriber(youTubeSubscriber1);
        youtubeChannel.addSubscriber(youTubeSubscriber2);
        youtubeChannel.addSubscriber(youTubeSubscriber3);
        youtubeChannel.addSubscriber(emailSubscriber1);
        youtubeChannel.addSubscriber(emailSubscriber2);
        youtubeChannel.addSubscriber(emailSubscriber3);
        youtubeChannel.addSubscriber(pushNotificationSubscriber1);
        youtubeChannel.addSubscriber(pushNotificationSubscriber2);
        youtubeChannel.uploadNewVideo("Stack Playlist");
        youtubeChannel.uploadNewVideo("Queue Playlist");

    }
}
