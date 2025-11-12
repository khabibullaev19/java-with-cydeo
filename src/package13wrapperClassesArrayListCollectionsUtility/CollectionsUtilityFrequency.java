package package13wrapperClassesArrayListCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityFrequency {

    public static void main(String[] args) {

        // frequency()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 10, 10, 10, 10));
        System.out.println(list);

        int frequency = Collections.frequency(list, 10);
        System.out.println(frequency);

    }

}
