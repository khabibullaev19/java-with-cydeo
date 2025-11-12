package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsContains {

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

        boolean hasJava = list.contains("Java");
        System.out.println(hasJava);

    }

}
