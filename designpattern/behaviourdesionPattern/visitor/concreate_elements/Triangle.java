package designpattern.behaviourdesionPattern.visitor.concreate_elements;

import designpattern.behaviourdesionPattern.visitor.Shape;
import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;

public class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitors shapeVisitors) {
        shapeVisitors.visit(this);
    }
}
