package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsRemoveAll {

    public static void main(String[] args) {

        // removeAll()

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 10, 10, 20, 15, 25));
        System.out.println(list1);

        list1.removeAll(Arrays.asList(10, 20));
        System.out.println(list1);

    }

}
