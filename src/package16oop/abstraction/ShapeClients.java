package package16oop.abstraction;

public class ShapeClients {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3,4);
        Cube cube = new Cube(7);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(cube.area());

        System.out.println(cube.volume());

    }

}
