package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMinAndMax {

    public static void main(String[] args) {

        /*

                Collections Class Methods:

                min() -> Returns the minimum element in the specified collection.
                max() -> Returns the maximum element in the specified collection.
                sort() -> Sorts the complete collection in ascending order.
                reverse() -> Reverses the order of the elements in the specified collection.
                swap() -> Swaps the two elements at the specified indexes in the list.
                replaceAll() -> Replaces all occurrences of a specified element in a list with a new element.
                frequency() -> Returns the frequency of the specified element in the specified collection.

         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 10, 10, 20, 15, 25, 200, 300, 0, -5));
        System.out.println(list);

        int minValueOfList = Collections.min(list);
        System.out.println("min value: " + minValueOfList);

        int maxValueOfList = Collections.max(list);
        System.out.println("max value: " + maxValueOfList);

    }

}
