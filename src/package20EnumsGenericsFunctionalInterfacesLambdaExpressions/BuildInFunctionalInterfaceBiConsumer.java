package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.function.BiConsumer;

public class BuildInFunctionalInterfaceBiConsumer {

    /*

        - Represents a function which takes two arguments (any objects) and does not return a value.

     */

    public static void main(String[] args) {

        BiConsumer<String,Integer> printMultipleTimes = (a,b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };

        printMultipleTimes.accept("Wooden Spoon",5);

    }

}
