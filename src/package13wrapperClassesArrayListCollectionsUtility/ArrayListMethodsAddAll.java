package package13wrapperClassesArrayListCollectionsUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsAddAll {

    public static void main(String[] args) {

        // addAll()

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);
        System.out.println(list1);

        list1.addAll(4,list2);
        System.out.println(list1);

        list1.addAll(Arrays.asList(21,31,41,51));
        System.out.println(list1);

    }

}
