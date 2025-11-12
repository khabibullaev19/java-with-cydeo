package package16oop.inheritance;

public class Animal {

    public String name, breed, size;
    public int age;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String name, String breed, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("animal","no need","large", 12);
    }

}
