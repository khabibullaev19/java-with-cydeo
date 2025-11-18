package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsFilter {

    // filter()

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);

        numbers = numbers.
                        stream().
                            filter(p -> p % 2 == 0).
                            map(p -> p * 10).
                                collect(Collectors.toList());
        System.out.println(numbers);

    }

}
