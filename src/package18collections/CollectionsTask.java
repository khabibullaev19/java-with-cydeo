package package18collections;

import java.util.*;

public class CollectionsTask {

    /*

        Write a program that takes a List of fruits as input and removes duplicate elements from the List.
        The program should remove duplicates while preserving the order of the original List.

        Ex:
           fruits = ["apple","orange","banana","apple",null,"grape","banana",null]

           Output:
                  [apple,orange,banana,null,grape]

     */

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("apple","orange","banana","apple",null,"grape","banana",null));
        System.out.println(fruits);

        Set<String> set = new LinkedHashSet<>(fruits);
        System.out.println(set);

        System.out.println("------------------------");

        List<String> result = new ArrayList<>();

        for (String each : fruits) {
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result);

    }

}
