package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(10);
        list2.add(100);
        list2.add(30);
        list2.add(20);

        boolean r1 = list2.containsAll(list1);
        System.out.println(r1);//true

        // list2 contains: 40, 30, 50, 60, 70
        boolean r2 = list2.containsAll(Arrays.asList(40, 30, 50, 60, 70));
        System.out.println(r2);//false

    }

}
