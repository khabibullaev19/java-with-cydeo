package package16oop.inheritance;

public class Mammal extends Animal{

    public Mammal(String name, String breed, String size, int age) {
        super(name, breed, size, age);
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal("kit","nothing","large",12);
        System.out.println(mammal);
    }

}
