package package07scannerclass;

import java.util.Scanner;

public class ScannerMethodsForDecimals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal: ");
        double decimal = scanner.nextDouble();

        System.out.println("The decimal is: " + decimal);

    }

}
