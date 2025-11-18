package package21streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTerminalOperationsCount {

    // count()

    public static void main(String[] args) {

        long result = Stream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.println(result);

        String[] words = {"Java","Python","C#","C++","Java","Ruby","Swift","Java","Java"};

        long java = Arrays.stream(words).
                            filter(p -> p.equals("Java")).
                            count();
        System.out.println(java);

    }

}
