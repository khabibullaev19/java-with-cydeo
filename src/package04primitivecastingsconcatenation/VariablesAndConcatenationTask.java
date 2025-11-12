package package04primitivecastingsconcatenation;

public class VariablesAndConcatenationTask {

    public static void main(String[] args) {

        /*
                Task: Calculate Gross Income

             Declare the following variables with the appropriate data types:
                hourlyRate: The hourly rate of pay.
                weeklyHours: The number of hours worked in a week.

             Use the provided information to calculate the following:
                salary: The gross pay before any taxes

                Display each of the variable and results in the following format:
                    Ex:
                        hourlyRate: $50
                        weeklyHours: 45

                        output:
                            Gross pay is $117000
         */

        double hourlyRate = 40.5;
        int weeklyHours = 40;

        double salary = hourlyRate * weeklyHours * 52;

        System.out.println("You are making $" + hourlyRate + " dollars per hour.");
        System.out.println("Gross Pay is $" + salary);

    }

}
