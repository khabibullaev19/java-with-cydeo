package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BuildInFunctionalInterfaceBiFunction {

    /*

        - Represents a function which takes two arguments (any objects) and return a value(any object).

     */

    public static void main(String[] args) {

        BiFunction<int[],int[], List<Integer>> mergeTwoArrays = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }

            for (int each : b) {
                list.add(each);
            }

            return list;
        };

        int[] arr1 = {5,7,9,11};
        int[] arr2 = {100,200,300};
        List<Integer> result = mergeTwoArrays.apply(arr1,arr2);
        System.out.println(result);

    }

}
