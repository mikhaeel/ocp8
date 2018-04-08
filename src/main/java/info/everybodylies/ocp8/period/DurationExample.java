package info.everybodylies.ocp8.period;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationExample {
    public static void main(String[] args) {
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2018, Month.APRIL, 9, 18, 10));
        System.out.println(d);
    }

}
