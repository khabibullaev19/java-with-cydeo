package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaceBiPredicate {

    /*

        - Represents a function which takes two arguments (any objects) and returns boolean.

     */

    public static void main(String[] args) {

        BiPredicate<int[],Integer> contains = (a,b) -> {
            for (int each : a) {
                if (each == b) {
                    return true;
                }
            }
            return false;
        };

        int[] nums = {100,200,300,400,500};
        boolean result = contains.test(nums,400);
        System.out.println(result);

    }

}
