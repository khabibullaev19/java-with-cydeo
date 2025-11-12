package package18collections;

import java.util.Collections;
import java.util.LinkedList;

public class ListLinkedList02 {

    public static void main(String[] args) {

        // addFirst() adds the element at the beginning of the linkedList

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.addFirst("B");
        linkedList.addFirst("C");
        linkedList.add("B");
        linkedList.add("B");
        System.out.println(linkedList);

        // addLast()
        linkedList.addLast("N");
        System.out.println(linkedList);

        // getFirst() gets the first element from the list
        System.out.println(linkedList.getFirst());

        // getLast()
        System.out.println(linkedList.getLast());

        //Collections.sort();
        Collections.sort(linkedList);
        System.out.println(linkedList);

        // contains()
        System.out.println(linkedList.contains("N"));

        // element() -> Retrieves and does not remove the head (first element) of this list.
        System.out.println(linkedList.element());
        System.out.println(linkedList);

        // get(index)
        System.out.println(linkedList.get(2));

        // removeFirstOccurrence()
        linkedList.removeFirstOccurrence("B");
        System.out.println(linkedList);

        // removeLastOccurrence()
        linkedList.removeLastOccurrence("B");
        System.out.println(linkedList);

        // clear() removes all elements
        linkedList.clear();
        System.out.println(linkedList);

    }

}
