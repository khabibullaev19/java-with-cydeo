package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsSizeAndGet {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("CYDEO");
        list.add("Java");
        list.add("SDET");
        System.out.println(list);

        // size()
        int totalElements = list.size();
        System.out.println("Total Elements: " + totalElements);

        String thirdElement = list.get(2);
        System.out.println(thirdElement);

    }

}
