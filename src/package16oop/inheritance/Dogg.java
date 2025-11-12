package package16oop.inheritance;

public class Dogg extends Animall{

    public Dogg(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Dogg " + name + " is eating dog food");
    }
}
