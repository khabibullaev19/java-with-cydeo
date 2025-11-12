package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {

        /*
                Warm up
                1. Create an integer list which has 5 elements.
                2. Put the elements in natural order.
                3. Find the sum of the squares of the last 3 elements on the console.
                4. Print the sum on the console.
                5. Use Functional Programming.
         */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7, 5, 1, 4, 3));
        Collections.sort(list);

        int result = list.stream()
                //.sorted()
                .filter(t -> list.indexOf(t) > 1)
                .map(Lambda03::square)
                .reduce(0,(t, u) -> t+u);
        System.out.println(result);

    }

    public static int square(int number) {
        return number * number;
    }

}
