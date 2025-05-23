package desingprincipals.solid._02_OCP.Good_Code.Concreate_Classes;

import desingprincipals.solid._02_OCP.Good_Code.interfaces.Shape;

public class Rectangle implements Shape {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
