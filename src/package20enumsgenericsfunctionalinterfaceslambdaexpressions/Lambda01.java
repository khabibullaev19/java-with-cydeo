package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        /*
            1. Lambda is "Functional Programming".
            2. Until now, we used "Structured Programming".
         */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(12,9,13,4,6,2,4,12,15));

        //Print all the elements on the console one by one using "Structured Programming"
        //1. Way
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2. Way:
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Print all the elements on the console one by one using "Functional Programming"

        //1 way -> lambda expression:
        list.stream()
                    .forEach(t -> System.out.print(t + " "));//t-> Action with "t" ==> Lambda expression

        System.out.println();

        //2 way :: method reference:
        list.stream()
                .forEach(System.out::print); // Method reference => Class name :: method name from the class

        System.out.println();
        // Print all even elements on the console one by one using "Structured programming"
        for (Integer i : list) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        // Print all even elements on the console one by one using "Functional programming"
        list.stream()
                .filter(t -> t % 2 == 0)
                .forEach(System.out::print);

        System.out.println();
        // Print all elements which are divisible by 3 on the console one by one using "Structured programming"
        list.stream()
                .filter(t -> t % 3 == 0)
                .forEach(System.out::print);

        System.out.println();
        list.stream()
                .filter(Lambda01::isEven)
                .forEach(System.out::print);

        System.out.println();

        // Print the squares of all odd elements by using "Functional Programming"
        list.stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t * t)
                .forEach(System.out::print);

        System.out.println();

        list.stream()
                .filter(Lambda01::isOdd)
                .map(Lambda01::square)
                .forEach(System.out::print);

        System.out.println();

        list.stream()
                .filter(Lambda01::isEven)
                .map(Lambda01::cubes)
                .forEach(System.out::print);

        System.out.println();

        list.stream()
                .filter(t -> t % 2 == 0)
                .map(t -> t * t * t)
                .forEach(t -> System.out.print(t + " "));

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int square(int number) {
        return number * number;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static int cubes(int number) {
        return number * number * number;
    }

}
