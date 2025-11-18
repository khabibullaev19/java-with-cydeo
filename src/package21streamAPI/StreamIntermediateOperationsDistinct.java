package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsDistinct {

    // distinct()

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9));
        System.out.println(numbers);

        numbers = numbers.
                        stream().
                            distinct().
                                collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("======================");

        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9};
        System.out.println(Arrays.toString(nums));

        nums = Arrays.stream(nums).
                            distinct().
                                toArray();
        System.out.println(Arrays.toString(nums));

    }

}
