package package23collectionswithtechpro;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class QueueDeque {

    public static void main(String[] args) {

        /*
            Deque -> Double ended Queue, it is an interface.

            Note: For Queue you can add new elements to the end of the Queue,
                  but for Deque you can add elements to the end and to the beginning.

            For Queue you can remove elements from the beginning of the Queue,
            but for Deque you can remove elements from the beginning and from the end of the Deque.
         */

        Deque<String> deque = new LinkedList<>();
        deque.addAll(Arrays.asList("Chris","Ali","Brandon","Angie","Tucker"));
        System.out.println(deque);

        deque.addFirst("XXX");
        System.out.println(deque);

        deque.addLast("ZZZ");
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        // If add() or addLast() cannot add the element for any reason, they throw
        // IllegalStateException, but if offer() cannot add the element for any reason,
        // it returns false.
        deque.offer("YYY");
        System.out.println(deque);

    }

}
