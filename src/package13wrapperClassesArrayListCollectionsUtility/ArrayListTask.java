package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTask {

    public static void main(String[] args) {

        /*
            Task: Rearrange Zeros to the End of an ArrayList

            Write a program that reorganizes an ArrayList by moving all the zeros to the last indexes
            of the list.
            While maintaining the order of the non-zero elements.

                Ex:
                    ArrayList: {1, 0, 2, 0, 3, 0, 4, 0}

                Output:
                    {1, 2, 3, 4, 0, 0, 0, 0}
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);

        int zeros = Collections.frequency(list, 0);
        System.out.println(zeros);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for (int i = 0; i < zeros; i++) {
            list.add(0);
        }
        System.out.println(list);

    }

}
