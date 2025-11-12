package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class LoopingThroughArrayListWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Wooden Spoon");
        list.add("Cydeo");

        for (String each : list) {
            System.out.println(each);
        }

    }

}
