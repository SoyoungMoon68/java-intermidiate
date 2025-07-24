package time;

import java.time.*;

public class OffsetDateTimeMain {

    public static void main(String[] args) {

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
//nowOdt = 2025-07-21T15:30:19.603352+09:00
//ldt = 2030-01-01T13:30:50
//odt = 2030-01-01T13:30:50+01:00