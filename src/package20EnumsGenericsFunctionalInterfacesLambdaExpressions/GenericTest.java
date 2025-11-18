package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        Integer[] numbers = {10,20,30,40,50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

        Generics.printEach(numbers);
        System.out.println();
        Generics.printEach(characters);

        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30));

        Generics.printEach(list);

    }

}
