package package12arraysmultidimensionalarrays;

import java.util.Arrays;

public class ArraysUtilityClass {

    public static void main(String[] args) {

        // Provides static methods for manipulating Arrays.
        // Presented in java.util package.

        /*
            toString() -> Returns a string representation of the contents of this array
            equals() -> Returns boolean, checks if both the arrays are equal or not.
            sort() -> Sorts the complete array in ascending order.
            copyOf() -> Returns new array, copies the specified array,(truncating or padding with zeros if necessary)
            copyOfRange() -> Returns new array, copies the specified range of the specified array.
         */

        // toString()
        int[] scores = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(scores));

        // equals()
        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'A', 'B', 'C'};

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println("result: " + result);

        // sort()
        int[] numbers = {100, 50, 20, 10, 80, 90, 60, 30, 20, 40};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Ruby", "Java", "Python", "C#"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // copyOf()
        int[] nums = {100, 200, 300, 400};
        int[] resultOfNums = Arrays.copyOf(nums, 3);
        // if we provide the newLength more than the size of array
        // java adds new elements with default values to the end of array
        //int[] resultOfNums = Arrays.copyOf(nums, 7);
        System.out.println(Arrays.toString(resultOfNums));

        // copyOfRange()
        int[] nums2 = {10,  20, 30, 40, 50, 60, 70, 80, 90};
        //indexes:     0    1   2   3   4   5   6   7   8
        int[] resultOfNums2 = Arrays.copyOfRange(nums2, 2, 5+1);
        System.out.println(Arrays.toString(resultOfNums2));

    }

}
