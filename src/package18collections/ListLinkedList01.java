package package18collections;

import java.util.Arrays;
import java.util.LinkedList;

public class ListLinkedList01 {

    public static void main(String[] args) {

        /*
            LinkedList does not store "elements", it stores "nodes".
            "nodes" have two parts, data(value) and pointer(address)

            LinkedList starts from Head(pointer), ends with Tail(null).

            LinkedList does not use indexes.
            Because of that, in LinkedList accessing elements directly is difficult.
            If we need to access to an element directly, it is better to use ArrayList.

            Adding and removing elements are very fast with LinkedList. Because of that,
            if our program mostly does adding and removing operations, it is better to use
            LinkedList.
         */

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.addAll(Arrays.asList("Steve","Carl","Raj","Megan","Ali"));
        System.out.println(linkedList1);

        linkedList1.add(2,"XXX");
        System.out.println(linkedList1);

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.addAll(Arrays.asList("AAA","BBB"));
        System.out.println(linkedList2);

        linkedList1.addAll(linkedList2);
        System.out.println(linkedList1);

        linkedList1.addAll(4,linkedList2);
        System.out.println(linkedList1);

        linkedList1.remove(2);
        System.out.println(linkedList1);

        linkedList1.remove("AAA");
        System.out.println(linkedList1);

        linkedList1.removeAll(linkedList2);
        System.out.println(linkedList1);

    }

}
