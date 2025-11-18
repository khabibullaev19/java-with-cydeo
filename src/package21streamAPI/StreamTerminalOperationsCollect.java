package package21streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOperationsCollect {

    // collect()

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Python","Job","Apple","Wooden Spoon",
                                    "JavaScript","Jeep","Samsung","Book","Computer","Camera"));
        System.out.println(words);

        Set<String> result = words.
                                stream().
                                    filter(p -> p.startsWith("J")).
                                                collect(Collectors.toSet());
        System.out.println(result);

    }

}
