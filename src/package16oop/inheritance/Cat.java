package package16oop.inheritance;

public class Cat extends Mammal {

    /*
        Attributes:
                name, breed, size, age

        Actions:
                eat()
                move()
                toString()
                scratch()
     */

    public void scratch() {
        System.out.println(name + " is scratching...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, String breed, String size, int age) {
        super(name, breed, size, age);
    }

}
