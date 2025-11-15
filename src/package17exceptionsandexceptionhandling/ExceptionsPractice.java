package package17exceptionsandexceptionhandling;

import java.io.FileInputStream;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Program started");

        String str = null;

        try {
            //System.out.println(str.charAt(-20));
            //System.out.println(20/0);
            System.out.println(str.charAt(100));
        }catch (StringIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("String index out of bound exception has occurred");
        }catch (ArithmeticException e) {
            System.out.println("An Arithmetic exception has occurred");
        }catch (RuntimeException e) {
            System.out.println("Run Time Exception has occurred");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println();
        }

        System.out.println("Program Completed");

    }

}
