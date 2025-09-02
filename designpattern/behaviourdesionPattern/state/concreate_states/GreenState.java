package designpattern.behaviourdesionPattern.state.concreate_states;

import designpattern.behaviourdesionPattern.state.TrafficLightContext;
import designpattern.behaviourdesionPattern.state.TrafficLightState;

public class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from green to yellow state so car should wait and slow down");
        trafficLightContext.setState(new YellowState());

    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
