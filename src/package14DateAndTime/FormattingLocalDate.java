package package14DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDate {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE - dd/MMMM/yyyy");

        LocalDate date1 =  LocalDate.of(2013,8,5);
        System.out.println(date1);
        System.out.println(dtf.format(date1));

    }

}
