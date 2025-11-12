package package07scannerclass;

import java.util.Scanner;

public class ScannerMethodsNextLineVSOtherMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("age: " + age);
        System.out.println("full name: " + fullName);

    }

}
