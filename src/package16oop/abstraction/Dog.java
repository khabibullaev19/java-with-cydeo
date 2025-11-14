package package16oop.abstraction;

public class Dog extends Animal implements Playable{

    public Dog(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + name + " eat dog food!");
    }

    @Override
    public void play() {
    }

}
