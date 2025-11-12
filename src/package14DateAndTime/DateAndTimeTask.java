package package14DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeTask {

    public static void main(String[] args) {

        /*
            Task:
            Create a custom Java class called Employee with the following attributes:
            name: Name of the employee.
            date of birth: The date of birth of the employee.
            hired date: The hired date of the employee.

            The Employee class should have the following actions(methods):
            toString(): When you use an Employee object in a print statement, it should display the full information of the object.
         */

        Employee employee = new Employee();
        employee.name = "Ali";
        employee.birthDate = LocalDate.of(2002,11,7);
        employee.hiredDate = LocalDate.of(2025,10,2);

        System.out.println(employee);

    }

    public static class Employee {

        public String name;
        public LocalDate birthDate, hiredDate;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", birthDate=" + birthDate +
                    ", hiredDate=" + hiredDate +
                    '}';
        }

    }

}
