package package16oop.abstraction;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " eats the cat food!");
    }

    @Override
    public void play() {
    }

}
