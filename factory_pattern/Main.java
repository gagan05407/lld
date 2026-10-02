package factory_pattern;

import factory_pattern.Shapes.Shape;

class Main{
    public static void main(String args[]){
        Shape s1 = new ShapeFactory().getShape("Circle");
        Shape s2 = new ShapeFactory().getShape("Rectangle");
        Shape s3 = new ShapeFactory().getShape("Square");
        s1.draw();
        s2.draw();
        s3.draw();
    }
}