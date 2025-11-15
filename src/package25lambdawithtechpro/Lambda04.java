package package25lambdawithtechpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali","Mark","Jackson","Amanda","Ali","Mark"));
        System.out.println(list);

        // Print distinct elements on the console together with their length:
        list.stream()
                .distinct()
                .sorted()
                .forEach(t->System.out.print(t + " = " + t.length() + " | "));

        System.out.println();

        // Print distinct elements on the console, sort them according to their length
        list.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .forEach(t->System.out.print(t + " = " + t.length() + " | "));

        System.out.println();

        // Print distinct elements on the console, sort them according to their last character
        list.stream()
                .distinct()
                .sorted(Comparator.comparing(t-> t.charAt(t.length()-1)))
                .forEach(t->System.out.print(t + " = " + t.length() + " | "));

        System.out.println();

        // Print distinct elements on the console, in reverse order
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(t -> System.out.print(t + " = " + t.length() + " | "));

        System.out.println();

        // Print distinct elements whose length is less than 7 with upper cases on the console, in reverse order:
        list.stream()
                .distinct()
                .filter(t -> t.length() < 7)
                .map(t -> t.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(t->System.out.print(t + " = " + t.length() + " | "));

        System.out.println();

        // Another way to see distinct elements on the console:
        // Note: if you want to see the elements as sorted, do not use ==> collect(Collectors.toSet())
        System.out.println(list.stream()
                .filter(t -> t.length() < 7)
                .map(t -> t.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet()));

    }

}
