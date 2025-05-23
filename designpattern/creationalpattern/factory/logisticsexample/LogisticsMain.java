package designpattern.creationalpattern.factory.logisticsexample;

public class LogisticsMain {
    public static void main(String[] args) {
        LogisticService service = new LogisticService();
        service.processOrder("Road");
        service.processOrder("Air");
        service.processOrder("Sea");
    }
}
