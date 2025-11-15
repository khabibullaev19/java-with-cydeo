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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle){
            if ( ( (Circle)obj ).radius == this.radius ) {
                return true;
            }
        }
        return false;
    }
}
