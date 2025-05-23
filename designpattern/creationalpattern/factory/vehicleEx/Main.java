package designpattern.creationalpattern.factory.vehicleEx;

public class Main {
    public static void main(String[] args) {
        /*Vehicle vehicle1 = new Car();
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2 = new Truck();
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3 = new Bike();
        vehicle3.start();
        vehicle3.stop();*/
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2 = VehicleFactory.getVehicle("Truck");
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3 = VehicleFactory.getVehicle("Bike");
        vehicle3.start();
        vehicle3.stop();
    }
}
