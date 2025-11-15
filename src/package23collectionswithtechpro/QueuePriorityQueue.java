package package23collectionswithtechpro;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {

    public static void main(String[] args) {

        /*
            When you use PriorityQueue to create a Queue,
            sometimes elements will be in natural order,
            sometimes java puts them in order according to some comparison rules.

            But every time first element is being in the natural order.

            PriorityQueue does not accept "null" as an object.
         */

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList("Chris","Brandon","Tucker","Ali","Mark"));
        //queue1.add(null);
        queue1.add("Tucker");
        System.out.println(queue1);

        System.out.println(queue1.element());

        System.out.println(queue1.poll());
        System.out.println(queue1);

        System.out.println(queue1.peek());
        System.out.println(queue1);

        System.out.println(queue1.getClass());

        System.out.println(queue1.hashCode());

        System.out.println(queue1);

    }

}
