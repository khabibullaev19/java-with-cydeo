package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsMap {

    // map()

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(numbers);

        numbers = numbers.
                        stream().
                                map( p -> {
                                        if(p%2==0){
                                            return p * 3;
                                        }else {
                                            return p * 10;
                                        }
                                        }).
                                    collect(Collectors.toList());
        System.out.println(numbers);

    }

}
