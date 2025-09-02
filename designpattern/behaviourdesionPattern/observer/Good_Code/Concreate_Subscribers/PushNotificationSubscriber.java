package designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers;

import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.Subscriber;

public class PushNotificationSubscriber implements Subscriber {
    private String userDeviceId;

    public PushNotificationSubscriber(String userDeviceId) {
        this.userDeviceId = userDeviceId;
    }

    @Override
    public void update(String video) {
        System.out.println("Sending push notification to " + userDeviceId + " about new video: " + video);
    }
}
