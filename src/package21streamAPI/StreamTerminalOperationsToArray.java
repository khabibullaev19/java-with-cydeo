package package21streamAPI;

import java.util.Arrays;

public class StreamTerminalOperationsToArray {

    // toArray()

    public static void main(String[] args) {

        int[] numbers = {10,15,20,25,30,35,40,45,50};
        System.out.println(Arrays.toString(numbers));

        int[] result = Arrays.stream(numbers)
                                        .filter(p -> p % 2 == 0).
                                                                toArray();
        System.out.println(Arrays.toString(result));

    }

}
