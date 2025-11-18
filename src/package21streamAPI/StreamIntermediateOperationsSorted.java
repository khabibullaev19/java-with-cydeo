package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsSorted {

    // sorted()

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(20,10,9,15,12,0,1,3,4,5));
        System.out.println(numbers);

        numbers = numbers.
                        stream().
                            sorted().
                                collect(Collectors.toList());
        System.out.println(numbers);

    }

}
