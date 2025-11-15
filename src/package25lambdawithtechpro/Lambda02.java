package package25lambdawithtechpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali", "Mark", "Jackson","Amanda","Chris","Tucker"));
        System.out.println(list);

        list.stream()
                .forEach(t -> System.out.print(t + " | "));
        System.out.println();

        // Print the number of characters of every element on the console by using "Functional Programming"
        list.stream()
                .map(String::length)
                .forEach(Lambda02::printIntWithSpace);

        System.out.println();

        list.stream()
                .map(t -> t.length())
                .forEach(t -> printIntWithSpace(t));

        System.out.println();

        list.stream()
                .map(t -> t + " = " + t.length())
                .forEach(t -> System.out.print(t + " | "));

        System.out.println();

        // Print the number of characters of elements which have more than 5 characters on the console
        list.stream()
                .filter(t -> t.length() > 5)
                .map(t -> t + " = " + t.length())
                .forEach(t -> System.out.print(t + " | "));

        System.out.println();

        // Print the total number of character of all elements
        System.out.println(list.stream()
                .map(String::length)
                .reduce(0, (t, u) -> t + u));

        /*
            1. Add "!" to the end of every element.
            2. Find the total number of characters which contain "k".
         */
        System.out.println(list.stream()
                .map(t -> t.concat("!"))
                .filter(t -> t.contains("k"))
                .map(String::length)
                .reduce(0, (t, u) -> t + u));

        /*
            Find the multiplication of the length of every element which is starting with "A"
         */
        int result = list.stream()
                .filter(t -> t.startsWith("A"))
                .map(String::length)
                .reduce(1, (t, u) -> t * u);
        System.out.println(result);

        /*
            Concatenate all elements
            Print the result
         */

        String conc = list.stream()
                .reduce("", (t, u) -> t + u);
        System.out.println(conc);

        // Print all elements in natural order
        list.stream()
                .sorted()
                .forEach(t -> System.out.print(t + " | "));
        System.out.println();

        //Print the elements whose length is less than 6 in alphabetical order
        list.stream()
                .filter(t -> t.length() < 6)
                .sorted()
                .forEach(t -> System.out.print(t + " | "));

        System.out.println();

        //Print the minimum value of the length of the elements
        int minValue = list.stream()
                .map(String::length)
                .reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
        System.out.println(minValue);

        //Print the maximum value of the length of the elements
        int maxValue = list.stream()
                .map(String::length)
                .reduce(Integer.MIN_VALUE,(t,u) -> t>u ? t : u);
        System.out.println(maxValue);

    }

    public static void printIntWithSpace(int number) {
        System.out.print(number + " ");
    }

}
