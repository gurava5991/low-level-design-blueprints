package designpattern.behaviourdesionPattern.visitor.concreate_elements;

import designpattern.behaviourdesionPattern.visitor.Shape;
import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;

public class Rectangle implements Shape {
    public final double width;
    public final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(ShapeVisitors shapeVisitors) {
        shapeVisitors.visit(this);
    }
}
