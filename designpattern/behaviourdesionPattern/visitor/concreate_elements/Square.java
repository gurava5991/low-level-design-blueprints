package designpattern.behaviourdesionPattern.visitor.concreate_elements;

import designpattern.behaviourdesionPattern.visitor.Shape;
import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;

public class Square implements Shape {
    double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void accept(ShapeVisitors shapeVisitors) {
        shapeVisitors.visit(this);
    }
}
