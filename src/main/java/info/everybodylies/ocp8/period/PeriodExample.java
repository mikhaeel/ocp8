package info.everybodylies.ocp8.period;

import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2018, 4, 7);
        Period p = Period.between(now, localDate);
        System.out.println(p);
    }

}
