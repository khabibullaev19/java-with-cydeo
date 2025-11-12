package package08stringclass;

import java.util.Scanner;

public class StringTask2 {

    public static void main(String[] args) {

        /*
                Task: User Information from Email

            You are provided with a variable named email. It is assumed that an email address is constructed using
            a person's first name, followed by an underscore, and then their last name.

            Write a program that extracts and prints specific information about a user based on their email.
            This information should include the user's first name, last name, and the domain of the email address.
            The program should format the first and last names with the first letter in uppercase and the remaining letters in lowercase.

                    Ex:
                        Input: daniel_king@apple.com

                        Output:
                               First Name: Daniel
                               Last Name: King
                               Domain: apple
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.next();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_") +1, email.indexOf("@"));
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Domain: " + domain);

        scanner.close();

    }

}
