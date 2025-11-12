package package15classAndObjectsPart2;

public class ConstructorsTask {

    public static void main(String[] args) {

        /*
                Task: Car Custom Class
            Create a custom Java Class called Car with the following attributes:
                make, model, year, color, price

            Constructors:
                Implement multiple constructors for the "Car" class as follows:
                    Constructor 1: Set the "make" attribute of the Car object.
                    Constructor 2: Set the "make" and "model" attributes of the Car object.
                    Constructor 3: Set the "make", "model", and "year" attributes of the Car object.
                    Constructor 4: Set the "make", "model", and "color" attributes of the Car object.
                    Constructor 5: Set all attributes of the Car object(make, model, year, color, and price).

            The Car class should have the following actions (methods):
                toString(): When you use a Car object in a print statement, it should display the full information of
                the object.
         */

        Car car1 = new Car("Chevrolet");
        Car car2 = new Car("Toyota", "Corolla");
        Car car3 = new Car("Honda","Civic", 2025);
        Car car4 = new Car("Ferrari", "SF90", "Red");
        Car car5 = new Car("Lamborghini", "Aventador", 2025, "Black",100000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }

}
