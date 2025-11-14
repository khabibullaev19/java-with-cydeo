package package16oop.abstraction;

public class Cube extends Shape implements Volume{

    public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side * 6;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
