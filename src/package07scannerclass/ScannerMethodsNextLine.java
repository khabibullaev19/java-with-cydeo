package package07scannerclass;

import java.util.Scanner;

public class ScannerMethodsNextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello " + fullName);

    }

}
