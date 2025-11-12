package package05operators;

public class LogicalNOTOperator {

    public static void main(String[] args) {

        /*

         */

        System.out.println(!true);
        System.out.println(!false);

        int n = 100;

        boolean even = n % 2 == 0;
        boolean odd = !even;

        System.out.println(even);
        System.out.println(odd);

    }

}
