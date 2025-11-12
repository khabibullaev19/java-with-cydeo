package package18collections;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {

    public static void main(String[] args) {

        /*
            1. TreeSet is a Set so, no duplication.
            2. TreeSet puts the elements in ascending(natural) order.
            3. TreeSet is the slowest Set.
            4. TreeSet does not accept null as an element.(Gives RunTime exception)
            5. If you try to add repeated elements, java overwrites it.
         */

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.addAll(Arrays.asList("Ali","Mark","Brandon","Angie"));
        //treeSet1.add(null);
        treeSet1.add("Ali");
        System.out.println(treeSet1);

        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2);

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList("Ali","Mark","Brandon","Angie"));
        //System.out.println(hashSet);

        Set<String> treeSet2 = new TreeSet<>(hashSet);
        System.out.println(treeSet2);

        LocalTime localTime3 = LocalTime.now();
        System.out.println(localTime3);

        /*
            When you need to use TreeSet you have two options.
            1. Directly create a TreeSet and add the elements to it.
            2. Create a HashSet, add the elements to HashSet, then convert the HashSet to TreeSet.
         */

    }

}
