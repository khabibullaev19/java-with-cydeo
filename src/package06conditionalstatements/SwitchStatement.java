package package06conditionalstatements;

public class SwitchStatement {

    public static void main(String[] args) {

        char grade = 'A';

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B') {
            System.out.println("Great job!");
        } else if (grade == 'C') {
            System.out.println("Good job!");
        } else if (grade == 'D') {
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }

        System.out.println("----------");

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;

            case 'B':
                System.out.println("Great job!");
                break;

            case 'C':
                System.out.println("Good job!");
                break;

            case 'D':
                System.out.println("Passed!");
                break;

            default:
                System.out.println("Failed!");
        }

    }

}
