package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsEqualsIsEmpty {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("C#");
        list1.add("Python");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("C#");
        list2.add("Python");

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        System.out.println(list1 == list2);//false -> two different objects
        System.out.println(list1.equals(list2));//true -> checking values

        System.out.println(list1.isEmpty());//false
        list1.clear();
        System.out.println(list1.isEmpty());//true

    }

}
