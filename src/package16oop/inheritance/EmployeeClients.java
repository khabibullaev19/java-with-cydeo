package package16oop.inheritance;

public class EmployeeClients {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("James",35,"Math Teacher",90.000);
        Developer developer = new Developer("Hazel",28,"Java Developer",150.000,"Java");

        System.out.println(teacher);
        System.out.println(developer);

        teacher.work();
        developer.work();

    }

}
