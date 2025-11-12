package package14DateAndTime;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Time: " + localTime);

        LocalTime time1 = LocalTime.of(9,30);
        System.out.println("Time: " + time1);

    }

}
