package package16oop.inheritance;

public class Catt extends Animall{

    public Catt(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " is eating cat food");
    }

}
