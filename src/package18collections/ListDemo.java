package package18collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1,2,3,4,5,5));

        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5,5));

        System.out.println("arrayList" + arrayList);
        System.out.println("linkedList" + linkedList);
        System.out.println("vector" + vector);
        System.out.println("stack" + stack);//LIFO

        System.out.println("-----------------------------------------");

        System.out.println(arrayList.get(0));

        System.out.println("-----------------------------------------");

        System.out.println(stack);
        int n = ( (Stack<Integer>) stack ).pop();
        System.out.println(n);
        System.out.println(stack);

        int m = ( (Stack<Integer>) stack ).pop();
        System.out.println(m);
        System.out.println(stack);

    }

}
