package designpattern.behaviourdesionPattern.observer.Good_Code.Concreate_Subscribers;

import designpattern.behaviourdesionPattern.observer.Good_Code.interfaces.Subscriber;

public class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String video) {
        System.out.println("Sending email to " + email + " about new video: " + video);
    }
}
