package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.Arrays;

public class ArrayMethodsGenericsTaskTest {

    public static void main(String[] args) {

        ArrayMethods<String> obj = new ArrayMethods<>();

        String[] arr = {"Java","Python","Ruby"};

        arr = obj.reverse(arr);

        System.out.println(Arrays.toString(arr));

        String[] arr1 = {"A","B","C","D"};
        String[] arr2 = {"A","B","C","D","E","F"};

        arr1 = obj.merge(arr1,arr2);
        System.out.println(Arrays.toString(arr1));

    }

}
