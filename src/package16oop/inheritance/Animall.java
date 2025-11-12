package package16oop.inheritance;

public class Animall {

    public String name;
    public String breed;
    public int age;
    public String size;

    public Animall(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public String toString() {
        return "Animall{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
