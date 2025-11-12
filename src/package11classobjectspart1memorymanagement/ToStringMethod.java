package package11classobjectspart1memorymanagement;

public class ToStringMethod {

    public static void main(String[] args) {

        CustomClassDog dog1 = new CustomClassDog();
        dog1.name = "Max";
        dog1.breed = "German Shepherd";
        dog1.age = 3;
        dog1.gender = 'M';

        CustomClassDog dog2 = new CustomClassDog();
        dog2.name = "Lucy";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'F';

        // In the CustomClassDog class, used toString()
        System.out.println(dog1);
        System.out.println(dog2);

    }

}
