package package17exceptionsandexceptionhandling;

public class ThrowsKeyword {

    /*

        - Used within the method signature
        - The fastest way to get rid of the
          compilation error that's caused by a checked exception.

        - The caller of the method that has the throws keyword
          in its signature is responsible for handling the exception.

     */

    public static void main(String[] args) throws Exception {

        System.out.println("Program Started");
        System.out.println("Program Ended");

        method1();
        method2();
        method3();

    }

    public static void method1() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Wooden Spoon");
    }

    public static void method2() {

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Cydeo School");
    }

    public static void method3() throws RuntimeException{
        throw new RuntimeException("");
    }

}
