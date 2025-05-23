package desingprincipals.solid._03_LSP.Good_Code.main;

public class NonEngineVehicle extends Vehicle {
    @Override
    public void move() {
        // Movement logic
        System.out.println("Non-Engine Vehicles do not have start engine method");
    }
}
