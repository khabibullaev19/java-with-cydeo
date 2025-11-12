package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsIndexOfAndLastIndexOf {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C#");
        list.add("Python");
        list.add("Java");
        list.add("Ruby");
        list.add("C++");
        list.add("Java");
        System.out.println(list);

        System.out.println("-----------------");

        int index1 = list.indexOf("Java");
        System.out.println(index1);

        int index2 = list.lastIndexOf("Java");
        System.out.println(index2);

    }

}
