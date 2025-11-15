package package17exceptionsandexceptionhandling;

public class FinallyBlock {

    /*

        - An optional block that can be given after the last catch block.
        - Always executed after try & catch blocks whether an exception occurs or not.

     */

    public static void main(String[] args) {

        System.out.println("Program started");

        String str = null;

        try {
            System.out.println(str.toUpperCase());
        }catch (RuntimeException e) {
            System.out.println("An unchecked exception has occured");
            System.exit(0);
        }finally {
            System.out.println("Finally!!!");
        }

        System.out.println("Program Completed");

    }

}
