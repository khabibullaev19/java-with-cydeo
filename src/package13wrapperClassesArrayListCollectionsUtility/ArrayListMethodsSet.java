package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsSet {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.set(2, 300);
        System.out.println(list);

    }

}
