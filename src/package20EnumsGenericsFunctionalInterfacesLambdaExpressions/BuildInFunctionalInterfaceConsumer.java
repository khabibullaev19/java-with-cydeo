package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.function.Consumer;

public class BuildInFunctionalInterfaceConsumer {

    /*

        - Represents a function which takes one argument (any object) and does not return any value.

     */

    public static void main(String[] args) {

        Consumer<int[]> printEach = (arr) -> {
            for (int each : arr) {
                System.out.print(each + " ");
            }
        };

        int[] arr = {10,20,30,40,50};
        printEach.accept(arr);

    }

}
