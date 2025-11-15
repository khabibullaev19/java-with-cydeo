package package17exceptionsandexceptionhandling;

public class ThrowKeyword {

    /*

        - Used for manually throwing an exception.

     */

    public static void main(String[] args) {

        System.out.println("Program Started");

        //System.exit(0);

        throw new RuntimeException("Unexpected event has occurred");

        // After throwing an exception, we cannot put any action, since anyway the program stops
        System.out.println("Program Completed");

    }

}
