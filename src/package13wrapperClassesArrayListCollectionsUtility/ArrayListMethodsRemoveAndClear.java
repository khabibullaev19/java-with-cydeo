package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethodsRemoveAndClear {

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

        list.remove("Java");
        list.remove(2);
        System.out.println(list);

        System.out.println("------------");
        list.clear();
        System.out.println(list);

    }

}
