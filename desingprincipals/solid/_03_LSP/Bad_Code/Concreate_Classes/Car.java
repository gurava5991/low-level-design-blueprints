package desingprincipals.solid._03_LSP.Bad_Code.Concreate_Classes;

import desingprincipals.solid._03_LSP.Bad_Code.main.Vehicle;

public class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine started...");
    }
}
