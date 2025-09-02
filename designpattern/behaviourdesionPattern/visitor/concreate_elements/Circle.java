package designpattern.behaviourdesionPattern.visitor.concreate_elements;

import designpattern.behaviourdesionPattern.visitor.Shape;
import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;

public class Circle implements Shape {
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitors shapeVisitors) {
        shapeVisitors.visit(this);
    }
}
