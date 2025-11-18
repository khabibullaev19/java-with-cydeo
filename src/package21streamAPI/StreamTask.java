package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println(list);

        list = list.stream().map(p -> p.substring(0,3)).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3,5,10,11,12,13,15,18,20,20,25,5,10,35,49));
        System.out.println(numbers);

        numbers = numbers.
                    stream().
                        distinct().
                            filter(p -> p % 5 == 0).
                            map(p -> p * 100).
                            collect(Collectors.toList());
        System.out.println(numbers);

    }

}
