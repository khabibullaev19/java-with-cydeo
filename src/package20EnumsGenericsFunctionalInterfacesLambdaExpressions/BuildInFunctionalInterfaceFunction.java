package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BuildInFunctionalInterfaceFunction {

    /*

        - Represents a function which takes one argument(any object) and returns a value(any object).

     */

    public static void main(String[] args) {

        Function<int[], List<Integer>> arrayToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] nums = {10,20,30,40,50};
        List<Integer> list = arrayToList.apply(nums);
        System.out.println(list);

    }

}
