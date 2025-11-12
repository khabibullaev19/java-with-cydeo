package package11classobjectspart1memorymanagement;

public class CreatingObjectsDog {

    public static void main(String[] args) {

        CustomClassDog dog1 = new CustomClassDog();
        dog1.name = "Max";

        CustomClassDog dog2 = new CustomClassDog();
        dog2.name = "Lucy";

        System.out.println(dog1.name);
        System.out.println(dog2.name);

        dog1.eat();
        dog2.eat();

    }

}
