package package18collections;

import java.util.Arrays;
import java.util.HashSet;

public class SetHashSet {

    public static void main(String[] args) {

        /*
            Set = {1, 2, 3, 4}
            All elements must be unique, no duplication.

            1. HashSet
            2. LinkedHashSet
            3. TreeSet

            1. HashSet: Uses "hashing technique".
                        Does not maintain any order. it returns elements in random order.
                        When you try to add repeated elements, Java does not give compile/run time errors.
                        Java overwrites the new element to the old one.

                        Adding null as an element in a HashSet is allowed.

                        HashSet does not put elements in any order. It means HashSet does not work
                        on ordering element. HashSet is faster than others.
         */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList("Angie", "Brat Pit", "Boby", "Caroline Star"));
        System.out.println(hashSet);
        hashSet.add("Boby");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

    }

}
