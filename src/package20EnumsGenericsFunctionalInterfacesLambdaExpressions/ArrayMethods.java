package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods<T> {

    // reverse method
    public T[] reverse(T[] array) {

        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        Collections.reverse(list);

        return list.toArray(array);

    }

    // merge method
    public T[] merge(T[] arr1, T[] arr2){

        ArrayList<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        return list.toArray(arr1);

    }

    // ...

}
