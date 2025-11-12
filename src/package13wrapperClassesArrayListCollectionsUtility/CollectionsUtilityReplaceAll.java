package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityReplaceAll {

    public static void main(String[] args) {

        // replaceAll()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 10, 10, 10, 10));
        System.out.println(list);

        Collections.replaceAll(list, 10, 100);
        System.out.println(list);

    }

}
