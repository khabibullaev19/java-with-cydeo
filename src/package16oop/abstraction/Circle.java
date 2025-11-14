package package16oop.abstraction;

public class Circle extends Shape{

    public double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
