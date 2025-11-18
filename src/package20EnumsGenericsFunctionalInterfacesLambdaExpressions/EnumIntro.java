package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.Arrays;

public class EnumIntro {

    /*

        - Represents a group of constants (number of things).
        - Used for containing fixed set of constants.

     */

    public static void main(String[] args) {

        //String day;

        Day day = Day.MONDAY;

        switch (day) {

            case MONDAY:
                System.out.println("It's Monday");
                break;

            case TUESDAY:
                System.out.println("It's Tuesday");
                break;

            case WEDNESDAY:
                System.out.println("It's Wednesday");
                break;
        }

        Day[] weekdays = Day.values();
        System.out.println(Arrays.toString(weekdays));

    }

}
