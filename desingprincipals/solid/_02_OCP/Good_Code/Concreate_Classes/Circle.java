package desingprincipals.solid._02_OCP.Good_Code.Concreate_Classes;

import desingprincipals.solid._02_OCP.Good_Code.interfaces.Shape;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
