package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String avaliableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("Available Zone Id: " + avaliableZoneId);
            ZoneId zoneId = ZoneId.of(avaliableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZoneId = " + seoulZoneId);
    }
}
//Europe/London | ZoneRules[currentStandardOffset=Z]
//UTC | ZoneRules[currentStandardOffset=Z]
//GMT | ZoneRules[currentStandardOffset=Z]
//Asia/Seoul | ZoneRules[currentStandardOffset=+09:00]
//Asia/Dubai | ZoneRules[currentStandardOffset=+04:00]
//US/Arizona | ZoneRules[currentStandardOffset=-07:00]
//Asia/Istanbul | ZoneRules[currentStandardOffset=+03:00]
//Asia/Shanghai | ZoneRules[currentStandardOffset=+08:00]
//...
//Europe/Paris | ZoneRules[currentStandardOffset=+01:00]
//ZoneId.systemDefault = Asia/Seoul
//seoulZoneId = Asia/Seoul