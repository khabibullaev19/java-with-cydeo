package package16oop.polymorphism;

import package16oop.abstraction.Animal;
import package16oop.abstraction.Cat;
import package16oop.abstraction.Dog;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal animal01 = new Dog("Max","Husky",5,"Large");
        //animal01.bark();
        animal01.eat();

        Animal animal02 = new Cat("Lucy","Bengal",3,"Small");
        //animal02.meow();
        animal02.eat();

        Dog dog = new Dog("Max","Husky",5,"Large");
        Cat cat = new Cat("Lucy","Bengal",3,"Small");

        Animal animal1 = dog;//upcasting
        Animal animal2 = cat;//upcasting

        Animal animal3 = new Dog("Max","Husky",5,"Large");
        //animal3.bark();
        //Dog d = (Dog)animal3;
        ( (Dog)animal3 ).bark();

    }

}
