package designpattern.behaviourdesionPattern.visitor.concreate_visitors;

import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Circle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Rectangle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Square;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Triangle;

public class AreaCalculator implements ShapeVisitors {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Area of triangle: " + area);

    }

    @Override
    public void visit(Square square) {
        double area = square.getSideLength() * square.getSideLength();
        System.out.println("Area of square: " + area);
    }
}
