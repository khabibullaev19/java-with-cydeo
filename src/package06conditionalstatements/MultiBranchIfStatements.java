package package06conditionalstatements;

public class MultiBranchIfStatements {

    public static void main(String[] args) {

        // Write a program that can check if the given number is positive
        // negative or zero

        int num = -2;

        String result = null;

        if (num > 0) {
            result = "The result is positive!";
        } else if (num == 0) {
            result = "The result is zero!";
        }else {
            result = "The result is negative!";
        }

        System.out.println(result);

    }

}
