package package16oop.abstraction;

public abstract class Animal {

    public String name, breed, size;
    public int age;

    public Animal(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void eat();

}
