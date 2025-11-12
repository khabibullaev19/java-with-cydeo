package package16oop.inheritance;

public class Fish extends Animal {

    /*
        Attributes:
                name, breed, size, age

        Actions:
                eat()
                move()
                toString()
                swim()
     */

    public void swim() {
        System.out.println(name + " is swimming...");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public Fish(String name, String breed, String size, int age) {
        super(name, breed, size, age);
    }

}
