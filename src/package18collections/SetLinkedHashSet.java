package package18collections;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

    public static void main(String[] args) {

        /*
            1. LinkedHashSet is a Set, so no duplication.
            2. LinkedHashSet puts the elements in insertion order.
            3. LinkedHashSet accepts "null" as an element.
            4. LinkedHashSet overwrites if you add repeated elements.
         */

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList("Ali","Brandon","Tucker","Chris","Kavya"));
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        LocalTime lt2 = LocalTime.now();
        System.out.println(lt2);

        Set<String> hashSet = new HashSet<>(linkedHashSet);
        System.out.println(hashSet);

        LocalTime lt3 = LocalTime.now();
        System.out.println(lt3);

    }

}
