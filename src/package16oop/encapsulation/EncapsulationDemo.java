package package16oop.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "Ali";
        //person1.age = 23;
        System.out.println(person1);

        person1.setName("Ali");
        System.out.println(person1.getName());

        person1.setAge(-23);
        System.out.println(person1.getAge());

    }

}
