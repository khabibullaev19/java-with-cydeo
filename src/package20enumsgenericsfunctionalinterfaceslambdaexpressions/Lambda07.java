package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda07 {

    public static void main(String[] args) {

        // We cannot use arrays in Lambda, but if you want to use arrays in Lambda,
        // convert it into a list, then you can use.
        // But, for a list which is converted from an array, some methods will be disabled.
        int a[] = {12, 9, 13, 5, 8};
        List<int[]> list = Arrays.asList(a);
        list.stream()
                .sorted()
                .forEach(t -> System.out.print(Arrays.toString(t) + " "));

        System.out.println();

        // Instead of loops we can use IntStream ...
        IntStream.range(3,8)//excludes the second param
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        IntStream.rangeClosed(3, 8)//includes the second param
                .forEach(t -> System.out.print(t + " "));

        System.out.println();

        //Find the sum of the integers from 3 to 8
        int sum1 = IntStream.rangeClosed(3, 8)
                .sum();
        System.out.println(sum1);

        // Find the sum of the even integers from 3 to 8
        int sum2 = IntStream.rangeClosed(3, 8)
                .filter(t -> t % 2 == 0)
                .reduce(0,(t,u) -> t + u);
        System.out.println(sum2);

        // Find the multiplication of the integers from 3 to 8
        int multiplication1 = IntStream.rangeClosed(3,8)
                .reduce(1, (t,u) -> t * u);
        System.out.println(multiplication1);

        // Find 7 factorial ==> 7! = 7x6x5x4x3x2x1
        // Get a value from user and calculate its factorial
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to calculate its factorial: ");
        int number = scanner.nextInt();
        int prod1 = IntStream.rangeClosed(1,number)
                .reduce(1, (t,u) -> t * u);
        System.out.println(number + "! = " + prod1);
        scanner.close();

        // Find the multiplication of the first 7 even counting numbers
        // 1. Way: (not recommended)
        int even1 = IntStream.rangeClosed(1,14)
                .filter(t -> t % 2 == 0)
                .reduce(1, (t,u) -> t * u);
        System.out.println(even1);

        // 2. Way: (recommended)
        int even2 = IntStream.iterate(2,t-> t + 2)
                .limit(7)
                .reduce(1, (t,u) -> t * u);
        System.out.println(even2);

        // Find the multiplication of the first 12 odd counting numbers
        // 1.Way: (not recommended)

        // 2.Way: (recommended)
        int odd2 = IntStream.iterate(1,t-> t + 2)
                .limit(9)
                .reduce(1, (t,u) -> t * u);
        System.out.println(odd2);

        // Find the multiplication of the first 5 odd counting numbers which are greater than 6(Use iterator() and limit())
        int it = IntStream.iterate(7,t -> t + 2)
                .limit(5)
                .reduce(1, (t,u) -> t * u);
        System.out.println(it);

    }

}
