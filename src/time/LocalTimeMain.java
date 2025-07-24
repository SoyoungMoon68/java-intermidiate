package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("LocalTime nowTime: " + nowTime);
        System.out.println("LocalTime ofTime: " + ofTime);

        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("LocalTime ofTimePlus + 30s: " + ofTimePlus);
    }
}
//LocalTime nowTime: 14:50:14.309774
//LocalTime ofTime: 09:10:30
//LocalTime ofTimePlus + 30s: 09:11