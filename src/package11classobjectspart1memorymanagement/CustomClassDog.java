package package11classobjectspart1memorymanagement;

public class CustomClassDog {

    public String name;
    public String breed;
    public int age;
    public char gender;

    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return "CustomClassDog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
