package desingprincipals.solid._02_OCP.Bad_Code;

class Rectangle {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        }
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println(ac.calculateArea(new Rectangle(10, 20)));
        System.out.println(ac.calculateArea(new Circle(5)));
    }
}
