package package16oop.polymorphism;

import package16oop.abstraction.Animal;
import package16oop.abstraction.Cat;
import package16oop.abstraction.Dog;

public class InstanceOfKeyword {

    /*

        -> The instanceof keyword can be used to check if the object is a certain class.
        -> Returns boolean.

     */
    public static void main(String[] args) {

        Animal animal = new Dog("BBB","None",4,"Big");

        if (animal instanceof Cat) {
            System.out.println("It is Cat");
        }else {
            System.out.println("It is not Cat");
        }

    }

}
