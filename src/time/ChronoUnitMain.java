package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value: " + value);
        }
        System.out.println("Hours = " + ChronoUnit.HOURS);
        System.out.println("Hours.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("Days = " + ChronoUnit.DAYS);
        System.out.println("Days.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        //차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(2, 10, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minutesBetween = " + minutesBetween);
    }
}
//value: Nanos
//value: Micros
//value: Millis
//value: Seconds
//value: Minutes
//value: Hours
//value: HalfDays
//value: Days
//value: Weeks
//value: Months
//value: Years
//value: Decades
//value: Centuries
//value: Millennia
//value: Eras
//value: Forever
//Hours = Hours
//Hours.duration = 3600
//Days = Days
//Days.duration = 86400
//secondsBetween = 3600
//minutesBetween = 60
