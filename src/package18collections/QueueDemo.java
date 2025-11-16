package package18collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90,200,300));
        System.out.println("Priority Queue: " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90,200,300));
        System.out.println("Array Dequeue: " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90,200,300));
        System.out.println("LinkedList: " + linkedList);

        System.out.println( ((LinkedList<Integer>)linkedList).get(1) );

        System.out.println("-------------------------------");

        System.out.println(priorityQueue);
        int n = priorityQueue.poll();
        System.out.println(n);
        System.out.println(priorityQueue);

    }

}
