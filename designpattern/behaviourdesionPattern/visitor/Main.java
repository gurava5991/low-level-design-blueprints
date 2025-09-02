package designpattern.behaviourdesionPattern.visitor;

import designpattern.behaviourdesionPattern.visitor.concreate_elements.Circle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Rectangle;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Square;
import designpattern.behaviourdesionPattern.visitor.concreate_elements.Triangle;
import designpattern.behaviourdesionPattern.visitor.concreate_visitors.AreaCalculator;
import designpattern.behaviourdesionPattern.visitor.concreate_visitors.SvgExporterVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //concreate elements
        Shape circle = new Circle(10.0);
        Shape rectangle = new Rectangle(10.0, 20.0);
        Shape triangle = new Triangle(10.0, 20.0);
        Shape square = new Square(10.0);

        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle, square);

        //concreate visitor : AreaCalculator
        System.out.println("adding area calculator visitor for all shapes:");
        ShapeVisitors areaCalculator = new AreaCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("---------------------");
        //concreate visitor : SvgExporterVisitor
        System.out.println("adding svg exporter visitor for all shapes:");

        SvgExporterVisitor svgExporterVisitor = new SvgExporterVisitor();

        for (Shape shape : shapes) {
            shape.accept(svgExporterVisitor);
        }



    }
}
