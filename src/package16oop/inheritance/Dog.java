package package16oop.inheritance;

public class Dog extends Mammal {

    /*
        Attributes:
                name, breed, size, age

        Actions:
                eat()
                move()
                toString()
                bark()
     */

    public void bark() {
        System.out.println(name + " is Barking...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, String breed, String size, int age) {
        super(name, breed, size, age);
    }
}
