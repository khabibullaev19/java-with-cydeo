package package09custommethods;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(sum(2,6));

        System.out.println(sum(2,2,2));

        System.out.println(sum(5,2,2));

    }

    // Create a function that can return the sum of two numbers
    public static int sum(int a, int b) {
        return a+b;
    }

    // Create a function that can return the sum of three numbers
    public static int sum(int a, int b, int c) {
        return sum(a,b) + c;
    }

    // Create a function that can return the sum of four numbers
    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }

}
