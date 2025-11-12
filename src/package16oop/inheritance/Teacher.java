package package16oop.inheritance;

public class Teacher extends Employee{

    public Teacher(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Teacher " + getName() + " is teaching");
    }
}
