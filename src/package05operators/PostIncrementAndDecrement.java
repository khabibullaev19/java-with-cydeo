package package05operators;

public class PostIncrementAndDecrement {

    public static void main(String[] args) {

        /*
                -> Increment/decrement operators are placed AFTER the Operand.

                -> The old value of the variable will be used first before increasing/decreasing
                   the value by 1 in the memory.
         */

        int x = 20;

        System.out.println(x++);//20
        System.out.println(x);//21

        int y = 30;
        System.out.println(y--);//30
        System.out.println(y);//29

    }

}
