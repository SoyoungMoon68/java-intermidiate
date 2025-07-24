package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);

        //TemporalAdjuster 사용
        //다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Reference date = " + dt);
        System.out.println("Next Friday = " + with1);

        //이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("Last Friday of the same month = " + with2);
    }
}
//dt = 2018-01-01T13:30:59
//changedDt1 = 2020-01-01T13:30:59
//changedDt2 = 2020-01-01T13:30:59
//Reference date = 2018-01-01T13:30:59
//Next Friday = 2018-01-05T13:30:59
//Last Friday of the same month = 2018-01-28T13:30:59