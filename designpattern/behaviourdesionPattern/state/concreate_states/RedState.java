package designpattern.behaviourdesionPattern.state.concreate_states;

import designpattern.behaviourdesionPattern.state.TrafficLightContext;
import designpattern.behaviourdesionPattern.state.TrafficLightState;

public class RedState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from red to greed state so car can go");
        trafficLightContext.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "red";
    }
}
