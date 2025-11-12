package package14DateAndTime;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Today: " + localDate);

        LocalDate date1 = LocalDate.of(1985, 7, 5);
        System.out.println("date1: " + date1);

    }

}
