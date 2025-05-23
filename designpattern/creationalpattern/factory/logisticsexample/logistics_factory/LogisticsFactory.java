package designpattern.creationalpattern.factory.logisticsexample.logistics_factory;

import designpattern.creationalpattern.factory.logisticsexample.concreate_models.AirLogistics;
import designpattern.creationalpattern.factory.logisticsexample.concreate_models.RoadLogistics;
import designpattern.creationalpattern.factory.logisticsexample.concreate_models.SeaLogistics;
import designpattern.creationalpattern.factory.logisticsexample.interfaces.Logistics;

public class LogisticsFactory {
    public static Logistics getLogistics(String type) {
        if (type.equals("Road")) {
            return new RoadLogistics();
        } else if (type.equals("Sea")) {
            return new SeaLogistics();
        } else if (type.equals("Air")) {
            return new AirLogistics();
        } else {
            return null;
        }

    }
}
