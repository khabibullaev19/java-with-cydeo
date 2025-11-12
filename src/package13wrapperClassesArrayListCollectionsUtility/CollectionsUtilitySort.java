package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilitySort {

    public static void main(String[] args) {

        // sort()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 10, 10, 20, 15, 25, 200, 300, 0, -5));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }

}
