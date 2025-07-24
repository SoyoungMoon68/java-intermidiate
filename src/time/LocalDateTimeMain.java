package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,6,8,8,10,11);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus + 1000d = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 같은가? " + nowDt.isEqual(ofDt));

    }
}
//nowDt = 2025-07-21T15:03:29.420728
//ofDt = 2016-06-08T08:10:11
//localDate = 2016-06-08
//localTime = 08:10:11
//localDateTime = 2016-06-08T08:10:11
//ofDtPlus + 1000d = 2019-03-05T08:10:11
//ofDtPlus1Year = 2017-06-08T08:10:11
//현재 날짜 시간이 지정 날짜 시간보다 이전인가? false
//현재 날짜 시간이 지정 날짜 시간보다 이후인가? true
//현재 날짜 시간이 지정 날짜 시간보다 같은가? false