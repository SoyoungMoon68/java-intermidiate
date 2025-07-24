package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        //기간 차이
        LocalDate startDate = LocalDate.of(2033, 1, 1);
        LocalDate endDate = LocalDate.of(2034, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("Period: " + between.getMonths() + " months " + between.getDays() + " days" );
    }

}
//period = P10D
//currentDate = 2030-01-01
//plusDate = 2030-01-11
//Period: 3 months 1 days