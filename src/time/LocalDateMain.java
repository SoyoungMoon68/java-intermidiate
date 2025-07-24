package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowdate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2025, 6, 8);
        System.out.println("Today is " + nowdate);
        System.out.println("Fixed date is " + ofDate);

        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("Fixed date + 10d " + plusDays);
    }
}
//Today is 2025-07-21
//Fixed date is 2025-06-08
//Fixed date + 10d 2025-06-18