package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);

        /*

            Just looping through List, does not remove elements properly:
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) < 4) {
                    list.remove(i);
                }

            }

            System.out.println(list);
         */

        // removeIf() is from Lambda expressions:
        list.removeIf(p -> p < 4);
        System.out.println(list);

    }

}
