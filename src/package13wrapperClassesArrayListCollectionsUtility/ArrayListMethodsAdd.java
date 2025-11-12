package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsAdd {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("CYDEO");
        list.add("Java");
        list.add("SDET");
        System.out.println(list);

        list.add(1,"Ali");
        System.out.println(list);

    }

}
