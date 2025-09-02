package designpattern.behaviourdesionPattern.visitor;


import designpattern.behaviourdesionPattern.visitor.concreate_elements.Circle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Rectangle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Square;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Triangle;

public interface ShapeVisitors {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
    void visit(Square square);
}
