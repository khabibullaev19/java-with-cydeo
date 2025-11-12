package package07scannerclass;

import java.util.Scanner;

public class ScannerMethodsNext {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);

    }

}
