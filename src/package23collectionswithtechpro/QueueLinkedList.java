package package23collectionswithtechpro;

import java.util.*;

public class QueueLinkedList {

    public static void main(String[] args) {

        /*
            1. Queue is an interface, not a class, so we cannot create object by using Queue.

               When you want to work on Queue you can create objects by using:
               A) LinkedList class
               B) PriorityQueue class

            2. In Queue every time elements are added to the end of the Queue.
               When you remove an element, every time it will be removed from the beginning of the Queue.
               FIFO => First in First out

            3. Queue accepts "null" as an object.
         */

        Queue<String> queue1 = new LinkedList<>();
        queue1.addAll(Arrays.asList("Ali","Brandon","Tucker","Chris","Mark"));
        queue1.add(null);
        queue1.add("Tucker");
        System.out.println(queue1);

        queue1.remove();
        System.out.println(queue1);

        queue1.remove(null);
        System.out.println(queue1);

        List<String> list = new ArrayList<>();
        list.add("Brandon");
        list.add("Tucker");

        queue1.removeAll(list);
        System.out.println(queue1);

        // element() returns the first element without removing
        // if queue is empty, element() gives exception
        System.out.println(queue1.element());

        // poll() returns the first element and removes it from the queue
        System.out.println(queue1.poll());
        System.out.println(queue1);

        // peek() returns the first element without removing
        // if queue is empty peek() does not give an exception, it returns "null"
        System.out.println(queue1.peek());
        System.out.println(queue1);

        queue1.clear();
        System.out.println(queue1.peek());
        System.out.println(queue1.element());//gives exception NoSuchElementException

    }

}
