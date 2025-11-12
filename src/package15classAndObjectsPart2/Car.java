package package15classAndObjectsPart2;

public class Car {

    String make;
    String model;
    int year;
    String color;
    double price;

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ",model='" + model + '\'' +
                ",year=" + year +
                ",color='" + color + '\'' +
                ",price=" + price +
                "}";
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car (String make, String model, String color) {
        this(make, model);
        this.color = color;
    }

    public Car (String make, String model, int year, String color, double price) {
        this(make, model, year);
        this.color = color;
        this.price = price;
    }

}
