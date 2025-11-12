package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilitySwap {

    public static void main(String[] args) {

        // swap()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 50, 40, 30));
        System.out.println(list);

        Collections.swap(list, 4, 2);
        System.out.println(list);

    }

}
