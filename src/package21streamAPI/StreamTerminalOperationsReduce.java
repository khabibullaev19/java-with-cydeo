package package21streamAPI;

import java.util.Arrays;

public class StreamTerminalOperationsReduce {

    // reduce() = (initialIdentity, BinaryOperator): combine the elements of stream and returns them as a single value

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int sum = Arrays.stream(arr).reduce(0, (a,b) -> a + b);
        int multiplication = Arrays.stream(arr).reduce(1, (a,b) -> a * b);
        System.out.println(sum);
        System.out.println(multiplication);

        System.out.println("----------------");

        String[] words = {"Java","Python", "C#","Java"};
        System.out.println(Arrays.toString(words));

        String combination = Arrays.stream(words).reduce("",(a,b) -> a + b + " ");
        System.out.println(combination);

    }

}
