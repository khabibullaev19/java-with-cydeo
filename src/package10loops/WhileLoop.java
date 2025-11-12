package package10loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        /*
            Write a program that can repeatedly ask user to enter a number
            until user enters a negative number
         */

        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while (!(num < 0)) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            if (num >= 0 ) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Good Job!");

    }

}
