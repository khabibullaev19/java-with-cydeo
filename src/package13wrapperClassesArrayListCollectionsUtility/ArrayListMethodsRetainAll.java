package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRetainAll {

    public static void main(String[] args) {

        // retainAll()

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 10, 10, 20, 15, 25));
        System.out.println(list);

        list.retainAll(Arrays.asList(10, 20));
        System.out.println(list);

    }

}
