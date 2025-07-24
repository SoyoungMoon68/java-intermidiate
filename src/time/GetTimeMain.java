package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        System.out.println("Month of year = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Day of month = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour of day = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute of hour = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Second of minute = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("Use convenient method");
        System.out.println("Year = " + dt.getYear());
        System.out.println("Month of year = " + dt.getMonthValue());
        System.out.println("Day of month = " + dt.getDayOfMonth());
        System.out.println("Hour of day = " + dt.getHour());
        System.out.println("Minute of hour = " + dt.getMinute());
        System.out.println("Second of hour = " + dt.getSecond());

        System.out.println("Not available in the convenient method");
        System.out.println("Minute of day = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("Second of day = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
//YEAR = 2030
//Month of year = 1
//Day of month = 1
//Hour of day = 13
//Minute of hour = 30
//Second of minute = 59
//Use convenient method
//Year = 2030
//Month of year = 1
//Day of month = 1
//Hour of day = 13
//Minute of hour = 30
//Second of hour = 59
//Don't use convenient method
//Minute of day = 810
//Second of day = 48659