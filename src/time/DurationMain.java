package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        //생성
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1,0);
        System.out.println("lt = " + lt);

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between.getSeconds()+" seconds");
        System.out.println("operation hours = " + between.toHours() + between.toMinutes()+" minutes");
    }
}
//duration = PT30M
//lt = 01:00
//plusTime = 01:30
//between = 3600 seconds
//operation hours = 160 minutes
