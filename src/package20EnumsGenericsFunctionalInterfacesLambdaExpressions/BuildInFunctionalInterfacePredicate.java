package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.function.Predicate;

public class BuildInFunctionalInterfacePredicate {

    /*

        - Represents a function which takes one argument(any object) and returns boolean.

     */

    public static void main(String[] args) {

        Predicate<Integer> isOdd = (a) -> {
            if (a % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(isOdd.test(5));

        Predicate<String> isPalindrome = (a) -> {
            String reversed = "";
            for (int i = a.length()-1; i >= 0; i--) {
                reversed += a.charAt(i);
            }
            return a.equalsIgnoreCase(reversed);
        };

        boolean a = isPalindrome.test("Wooden Spoon");
        System.out.println(a);

    }

}
