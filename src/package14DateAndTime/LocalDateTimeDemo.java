package package14DateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + localDateTime);

        LocalDateTime time1 = LocalDateTime.of(2021,12,1,12,30);
        System.out.println("Date and Time: " + time1);

    }

}
