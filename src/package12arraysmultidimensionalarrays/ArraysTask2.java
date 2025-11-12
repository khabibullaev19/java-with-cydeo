package package12arraysmultidimensionalarrays;

import java.util.Arrays;

public class ArraysTask2 {

    public static void main(String[] args) {

        /*
            Task: Merge two Integer Arrays into a Third Array

            Write a program that can merge two arrays of integers into a third array

                Ex:
                    Array 1: {1, 2, 3, 4}
                    Array 2: {5, 6, 7, 8, 9, 10}

                Output:
                    Merged Array: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
         */

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println(Arrays.toString(arr3));

        int i = 0;
        for (int eachArr1 : arr1) {
            arr3[i] = eachArr1;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

        for (int eachArr2 : arr2) {
            arr3[i] = eachArr2;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

    }

}
