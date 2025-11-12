package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;

public class LoopingThroughArrayListInIndexOrder {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //list.fori -> press enter
        //list.forr -> press enter
        //list.for -> press enter

    }

}
