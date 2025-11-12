package package06conditionalstatements;

public class IfStatementTask {

    public static void main(String[] args) {

        /*
            Task: Calculate Price and Calories of a Cappucino

            Given a variable named Size, write a program that displays the price and calorie information for
            a cappucino basen on its size. The valid cappucino sizes are "tall", "grande", and "venti".
            Each with its associated price and calorie values.

                Valid Sizes and Their information:
                    Tall:
                        Price: $3.69
                        Calories: 90

                    Grande:
                        Price: $3.99
                        Calories: 120

                    Venti:
                        Price: $4.29
                        Calories: 150

                    If the Size is invalid, the program should display "Invalid Size".
         */

        String size = "Venti";
        double price = 0;
        int calories = 0;

        if (size.equals("Tall") || size.equals("Grande") || size.equals("Venti")) {

            if (size.equals("Tall")) {
                price = 3.69;
                calories = 90;
            } else if (size.equals("Grande")) {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }
            System.out.println("Price is $" + price);
            System.out.println("Calories is " + calories);

        }else {
            System.out.println("Invalid Size!");
        }

    }

}
