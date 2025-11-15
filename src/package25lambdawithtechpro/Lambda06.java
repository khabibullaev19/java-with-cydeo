package package25lambdawithtechpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda06 {

    public static void main(String[] args) {

        /*
            1. Create a String list which has the elements "Ali","John","Ali","Alexander","Taylor","Ali","Jackson"
            2. Do not get the elements whose initial is "J"
            3. Select the distinct elements
            4. Put them in natural order according to the number of characters
            5. Convert all elements to upper cases
            6. Print the elements on the console
            7. Use "Functional Programming"
         */

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali","John","Ali","Alexander","Taylor","Ali","Jackson"));
        System.out.println(list);

        list.stream()
                .filter(t -> !t.startsWith("J"))
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .forEach(t -> System.out.print(t + " "));

    }

}
