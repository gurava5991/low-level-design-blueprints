package desingprincipals.solid._03_LSP.Bad_Code.Concreate_Classes;

import desingprincipals.solid._03_LSP.Bad_Code.main.Vehicle;

public class Bicycle extends Vehicle {
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have an engine");
    }
}
