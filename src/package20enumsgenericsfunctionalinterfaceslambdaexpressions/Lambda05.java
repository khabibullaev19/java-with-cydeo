package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda05 {

    public static void main(String[] args) {

        // Create 4 objects by using Course class
        Course courseTurkishDay = new Course("Summer","Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter","Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Winter","English Night", 93, 144);

        // Add them into a list
        List<Course> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);
        System.out.println(list);

        // Check if all average scores are less than 98
        boolean result1 = list.stream()
                .allMatch(t -> t.getAverageScore() < 98);
        System.out.println("Result1: " + result1);

        // Check if all course names contain "Day" word
        boolean result2 = list.stream()
                .allMatch(t -> t.getCourName().contains("Day"));
        System.out.println("Result2: " + result2);

        // Check if any number of students is 154
        boolean result3 = list.stream()
                .anyMatch(t -> t.getNumberOfStudents()==154);
        System.out.println("Result3: " + result3);

        // Check if any season is "Winter"
        boolean result4 = list.stream()
                .anyMatch(t -> t.getSeason().equals("Winter"));
        System.out.println("Result4: " + result4);

        // Check if no number of students is 100
        boolean result5 = list.stream()
                .noneMatch(t -> t.getNumberOfStudents()==100);
        System.out.println("Result5: " + result5);

        System.out.println("===========");

        // Sort the elements in natural order according to the average score
        list.stream()
                .sorted(Comparator.comparing(t-> t.getAverageScore()))
                .forEach(t -> System.out.println(t + " * "));

        System.out.println("===========");

        // Sort the elements in reverse order according to the number of students
        list.stream()
                .sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
                .forEach(t-> System.out.println(t + " * "));

        System.out.println("===========");

        // Sort the elements in reverse order according to the course name
        list.stream()
                .sorted(Comparator.comparing(Course::getCourName).reversed())
                .forEach(t-> System.out.println(t + " * "));

        System.out.println();

    }

}
