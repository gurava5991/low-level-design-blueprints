package designpattern.behaviourdesionPattern.state.concreate_states;

import designpattern.behaviourdesionPattern.state.TrafficLightContext;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext(new RedState());
        trafficLightContext.nextState();
        trafficLightContext.nextState();
        trafficLightContext.nextState();
    }
}
