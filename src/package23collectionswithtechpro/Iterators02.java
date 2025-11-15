package package23collectionswithtechpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        // Another usage of iterators:
        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("A","B","C","D"));
        System.out.println(list1);

        // Update the elements to AX, BX, CX, DX
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()){
            String element = listIterator.next();

            listIterator.set(element.concat("X"));
            //listIterator.set(element + "X");
        }
        System.out.println(list1);

        // Print the elements on the console in reverse order

        /*
            If you decide to use hasPrevious() and previous(), you should use hasNext() and next() first
            in order to move the pointer to the end.

            If you try to use hasPrevious() or previous() without hasNext() and next()
            the pointer stays in the beginning of the list.
         */
        while (listIterator.hasPrevious()){
            String element = listIterator.previous();

            System.out.print(element + " ");
        }

    }

}
