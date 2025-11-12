package package14DateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTime {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss-a");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(dtf.format(localTime));

    }

}
