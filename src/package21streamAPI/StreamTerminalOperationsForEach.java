package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTerminalOperationsForEach {

    // forEach()

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        list.stream().
                filter(p -> p > 5).
                    forEach(p -> System.out.print(p + " "));

    }

}
