package package10loops;

import java.util.Scanner;

public class WhileLoopTask {

    public static void main(String[] args) {

        /*
            Task: Room Reservation Task

            Write a program for the room reservation, The program asks the user whether they want to reserve a room.
            If the user enters "yes", the program should inquire about the type of room they wish to reserve.

            If the user enters "no", the program should display "Have a nice day". If the user provides an answer
            other than "yes" or "no", the program should prompt them to re-enter a valid response.

            Room Types and Prices:
                    King Bed ==> $120     Queen Bed ==> $100        Single Bed ==> $80

            The program should display the room reserved and the total price of the room.
            If the user selects an invalid room, they should be asked to reselect a room until they provide a valid choice.

                    Ex:
                        Program:
                            Would you like to reserve a room? (Yes/No) : yes
                                Which type of room would you like to reserve? (King Bed/Queen Bed/Single Bed): queen bed

                        Output:
                        You have reserved a Queen Bed. The total price is $100
         */

        Scanner scanner =new Scanner(System.in);
        int total = 0;

        System.out.print("Would you like to reserve a room? (Yes/No): ");
        String answer = scanner.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.print("Invalid entry, please re-enter: ");
            answer = scanner.next().toLowerCase();
        }

        scanner.nextLine();

        System.out.print("Which type of room would you like to reserve? (King Bed/Queen Bed/Single Bed): ");
        String room = scanner.nextLine().toLowerCase();

        while ( !(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed")) ) {
            System.out.print("Invalid entry, please re-enter (King Bed/Queen Bed/Single Bed): ");
            room = scanner.nextLine().toLowerCase();
        }

        if (room.equals("king bed")) {
            total = 120;
        } else if (room.equals("queen bed")) {
            total = 100;
        }else {
            total = 80;
        }

        System.out.printf("You have reserved a %s room type and your total is $%d\n", room, total);


    }

}
