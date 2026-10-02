package factory_pattern;
import factory_pattern.Shapes.Shape;
import factory_pattern.Shapes.Circle;
import factory_pattern.Shapes.Rectangle;
import factory_pattern.Shapes.Square;


class ShapeFactory{
    public Shape getShape(String draw){
        switch(draw){
            case "Square":
                return new Square();
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
