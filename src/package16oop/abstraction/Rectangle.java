package package16oop.abstraction;

public class Rectangle extends Shape{

    public double length, width;

    @Override
    public double area() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
