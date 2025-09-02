package designpattern.behaviourdesionPattern.state;

public interface TrafficLightState {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}
