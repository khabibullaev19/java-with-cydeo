package package18collections;

import java.util.*;

public class Iterators01 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(21,22,23));
        System.out.println(list1);

        for (int i : list1) {
            i = i + 5;
        }
        System.out.println(list1);

        //list.removeIf(p -> p > 10);
        //System.out.println(list);

        // To update a list we use Iterators:
        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()) {
            Object elements = iterator1.next();
            iterator1.remove();
        }
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(31,32,33));
        System.out.println(list2);

        //Increase the value of every element by 5
        ListIterator<Integer> listIterator = list2.listIterator();
        while(listIterator.hasNext()) {
            Integer elements = listIterator.next();
            listIterator.set(elements + 5);
        }
        System.out.println(list2);

        /*
            1- Create a list whose elements are String and every element has more than 4 characters
            2- Make last 3 characters of every element like ***
            3- Use ListIterator
         */

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Mustang","Camaro","Corvette","Suburban"));
        System.out.println(list3);

        ListIterator<String> listIterator2 = list3.listIterator();
        while(listIterator2.hasNext()) {
            String elements = listIterator2.next();

            listIterator2.set(elements.replace(elements.substring(elements.length()-3),"***"));
        }
        System.out.println(list3);

    }

}
