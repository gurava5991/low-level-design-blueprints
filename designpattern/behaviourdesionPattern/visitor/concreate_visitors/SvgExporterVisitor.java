package designpattern.behaviourdesionPattern.visitor.concreate_visitors;

import designpattern.behaviourdesionPattern.visitor.ShapeVisitors;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Circle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Rectangle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Square;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Triangle;

public class SvgExporterVisitor implements ShapeVisitors {
    @Override
    public void visit(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\" />");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("<rect width=\"" + rectangle.getWidth() + "\" height=\"" + rectangle.getHeight() + "\" />");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("<polygon points=\"" + triangle.getBase() + "," + triangle.getHeight() + " " + triangle.getBase() + "," + triangle.getHeight() + " " + triangle.getBase() + "," + triangle.getHeight() + "\" />");

    }

    @Override
    public void visit(Square square) {
        System.out.println("<rect width=\"" + square.getSideLength() + "\" height=\"" + square.getSideLength() + "\" />");
    }
}
