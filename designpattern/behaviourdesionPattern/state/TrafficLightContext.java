package designpattern.behaviourdesionPattern.state;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;

    public TrafficLightContext(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void setState(TrafficLightState newTrafficLightState) {
        this.trafficLightState = newTrafficLightState;
    }
    public void nextState() {
        this.trafficLightState.next(this);
    }
    public String getColor() {
        return this.trafficLightState.getColor();
    }
}
