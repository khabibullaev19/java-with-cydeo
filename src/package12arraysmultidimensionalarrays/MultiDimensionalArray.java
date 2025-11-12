package package12arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // An array of arrays.
        // A special variable that's used as a container of arrays.
        // The N dimensional array is a container for (N-1) dimensional arrays.

        //int[][] arr2D = new int[3][];
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        System.out.println(arr2D.length);
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[1][2]);

        for (int[] ints : arr2D) {

            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

        }

        System.out.println();

        for (int i = 0; i < arr2D.length; i++) {
            int[] arr1D = arr2D[i];
            System.out.println(Arrays.toString(arr1D));

            for (int j = 0; j < arr1D.length; j++) {
                int element = arr1D[j];
                System.out.println(element + " ");
            }

        }

    }

}
