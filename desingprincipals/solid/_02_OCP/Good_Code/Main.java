package desingprincipals.solid._02_OCP.Good_Code;

import desingprincipals.solid._02_OCP.Good_Code.Concreate_Classes.Circle;
import desingprincipals.solid._02_OCP.Good_Code.Concreate_Classes.Rectangle;
import desingprincipals.solid._02_OCP.Good_Code.interfaces.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());

    }
}
