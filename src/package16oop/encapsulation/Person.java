package package16oop.encapsulation;

public class Person {

    private String name;
    private int age;

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        if (name == null) {
            System.err.println("Name must be set!");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Name cannot be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Age cannot be negative: " + age);
            System.exit(1);
        }
        this.age = age;
    }

}
