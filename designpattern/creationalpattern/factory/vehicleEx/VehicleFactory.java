package designpattern.creationalpattern.factory.vehicleEx;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("Car")) {
            return new Car();
        } else if (vehicleType.equals("Truck")) {
            return new Truck();
        } else if (vehicleType.equals("Bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
