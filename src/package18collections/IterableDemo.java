package package18collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 4) {
                list1.remove(i);
            }
        }
        System.out.println(list1);

        System.out.println("---------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));
        System.out.println(list2);

        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4){
                iterator.remove();
            }
        }
        System.out.println(list2);

        System.out.println("------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));
        System.out.println(list3);

        list3.removeIf(p -> p < 4);
        System.out.println(list3);

    }

}
