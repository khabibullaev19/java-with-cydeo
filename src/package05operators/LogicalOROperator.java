package package05operators;

public class LogicalOROperator {

    public static void main(String[] args) {

        /*
            An integer variable named month is given
            Write a program that can check if the given month has 30 days in it.

                Months having 30 days in a year are:
                    April (4)
                    June (6)
                    September (9)
                    November (11)
         */

        int month = 9;

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        System.out.println("has30Days = " + has30Days);

    }

}
