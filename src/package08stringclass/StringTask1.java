package package08stringclass;

import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        /*
                Task: Format Full name

                Write a program that asks user to enter first and last names. After collecting this information, the program
                should print the user's full name in a regular format, with the first character of each name in uppercase.

                        Input:
                              First Name: "jAmEs"
                              Last Name: "KING"

                        Output:
                               Full Name: "James King"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().toLowerCase();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().toLowerCase();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1);
        lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        scanner.close();

    }

}
