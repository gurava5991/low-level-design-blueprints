package designpattern.creationalpattern.factory.logisticsexample.concreate_models;

import designpattern.creationalpattern.factory.logisticsexample.interfaces.Logistics;

public class RoadLogistics implements Logistics {
    @Override
    public void deliver() {
        System.out.println("Delivering by road...");
    }
}
