package time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
//dt = 2018-01-01T13:30:59
//plusDt1 = 2028-01-01T13:30:59
//plusDt2 = 2028-01-01T13:30:59
//plusDt3 = 2028-01-01T13:30:59