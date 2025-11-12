package package14DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTime {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE ~ dd/MMMM/yyyy ~ hh:mm:ssa");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dtf.format(localDateTime));

    }

}
