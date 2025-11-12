package package07scannerclass;

import java.util.Scanner;

public class ScannerMethodsForIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Age = " + age);

    }

}
