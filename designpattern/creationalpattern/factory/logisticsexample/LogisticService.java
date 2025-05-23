package designpattern.creationalpattern.factory.logisticsexample;

import designpattern.creationalpattern.factory.logisticsexample.interfaces.Logistics;
import designpattern.creationalpattern.factory.logisticsexample.logistics_factory.LogisticsFactory;

public class LogisticService {
    public void processOrder(String orderType) {
        Logistics logistics = LogisticsFactory.getLogistics(orderType);
        logistics.deliver();
    }
}
