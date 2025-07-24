package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포멧팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        //파싱: 문자를 날짜로
        String input = "01/01/2030";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}
//date = 2024-12-31
//formattedDate = 12/31/2024
//parsedDate = 2030-01-01