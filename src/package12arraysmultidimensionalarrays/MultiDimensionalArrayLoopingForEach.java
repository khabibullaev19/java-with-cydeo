package package12arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrayLoopingForEach {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int[] each1D : arr2D) {
            System.out.println(Arrays.toString(each1D));

            for (int eachElement : each1D) {
                System.out.println(eachElement);
            }

        }

    }

}
