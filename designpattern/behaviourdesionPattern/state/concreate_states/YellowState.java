package designpattern.behaviourdesionPattern.state.concreate_states;

import designpattern.behaviourdesionPattern.state.TrafficLightContext;
import designpattern.behaviourdesionPattern.state.TrafficLightState;

public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from yellow to red state so car should stop and wait");
        trafficLightContext.setState(new RedState());

    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
