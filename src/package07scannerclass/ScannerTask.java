package package07scannerclass;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {

        /*
            Task: Place an Order

            Write a program that can perform following steps:
                Ask the user to enter the name of a product (which can consist of multiple words)
                Ask the user to enter the price of the product (as a double)
                Ask the user to enter the quantity of the product (as an integer)
                Ask the user to enter their first name (a single word).

            Once you've gathered these information, print the order details in a specific format:
                ex:
                    Input:
                          Product Name: "Apple"
                          Price: 1.5
                          Quantity: 5
                          First Name: "Luke"

                    Output:
                          Luke, your order for 5 Apples has been placed. Your total is 7.5
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a product: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the price of the product: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        int productQuantity = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        double totalPrice = productPrice * productQuantity;

        System.out.printf("%s, your order for %d %s has been placed. Your total is $%.2f\n", firstName, productQuantity, productName, totalPrice);
        System.out.println(firstName + ", your order for " + productQuantity + " " + productName + " has been placed. Your total is $" + totalPrice);

    }

}
