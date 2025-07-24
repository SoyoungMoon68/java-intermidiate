package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포멧팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String formattedDatedTime = now.format(formatter);
        System.out.println("formattedDatedTime = " + formattedDatedTime);
        System.out.println(now);

        //파싱: 문자를 날짜와 시간으로
        String dateTimeString = "01/01/2030 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}
//formattedDatedTime = 12/31/2024 13:30:59
//2024-12-31T13:30:59
//parsedDateTime = 2030-01-01T11:30