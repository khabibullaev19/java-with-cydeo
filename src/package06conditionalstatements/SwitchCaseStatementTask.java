package package06conditionalstatements;

public class SwitchCaseStatementTask {

    public static void main(String[] args) {

        /*
            Task: Build a Basic Calculator

            You are provided with two double variables, num1 and num2, and a character variable named operator.
            Write a program that calculates the result based on the given math operator.
            If the operator is invalid, the program should return a result of 0.

                The program should accept the following math operators:
                    addition (+), subtraction (-), division (/), multiplication (*), and module (%).

                        Ex:
                            num1 = 2.5
                            num2 = 20.5
                            operator = '+'

                        Output: 23.0
         */

        double num1 = 3.90625;
        double num2 = 25.6;

        char operator = '*';

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("Result is " + result);

    }

}
