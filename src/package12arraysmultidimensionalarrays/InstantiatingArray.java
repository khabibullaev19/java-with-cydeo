package package12arraysmultidimensionalarrays;

import java.util.Arrays;

public class InstantiatingArray {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[1] = 20;
        //numbers[6] = 70; -> Out of bound exception

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);

    }

}
