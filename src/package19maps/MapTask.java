package package19maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTask {

    /*

        Create a Java program that calculates and displays the frequency of each character in a given String.
        This should be accomplished by utilizing a map data structure.

        Ex:
           str = "aabbbccccd"

           Output:
                 {"a" = 2, "b" = 3, "c" = 4, "d" = 1}

     */

    public static void main(String[] args) {

        String str = "aabbbccccd";

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            linkedHashMap.put(each,frequency);
        }

        System.out.println(linkedHashMap);

    }

}
