package package12arraysmultidimensionalarrays;

public class LoopingThroughArrayReversedOrder {

    public static void main(String[] args) {

        String[] array = {"Ruby", "Java", "Python", "C#"};

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //another way
        // -> array.fori => index order
        // -> array.forr = reversed order

    }

}
