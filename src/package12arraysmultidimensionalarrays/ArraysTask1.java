package package12arraysmultidimensionalarrays;

public class ArraysTask1 {

    public static void main(String[] args) {

        /*
            Task: Find common elements in Two Integer Arrays

            Write a program that finds and prints the common elements present in two integer arrays.

            Ex:
                Array 1: {1, 2, 3, 4, 5}
                Array 2: {4, 5, 6, 7, 89, 10, 11, 12}

            Output:
                Common Elements: 4 5
         */

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 89, 10, 11, 12};

        String commonElements = "Common elements: ";

        for (int eachArr1 : arr1) {

            for (int eachArr2 : arr2) {

                if (eachArr1 == eachArr2) {
                    commonElements += eachArr1 + " ";
                }

            }

        }
        System.out.println(commonElements);

    }

}
