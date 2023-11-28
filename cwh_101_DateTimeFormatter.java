import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class cwh_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        LocalDate d=LocalDate.now();
        System.out.println(dt);
        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd-MM-yyyy --k Q a");
        DateTimeFormatter df1 =DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter df3=DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter df4=DateTimeFormatter.ISO_ZONED_DATE_TIME;
        // DateTimeFormatter df10 = DateTimeFormatter.ISO_INSTANT;

        String mydate =dt.format(df);
        String mydate1 =dt.format(df1);
        String mydate2 =dt.format(df2);
        String mydate3 =dt.format(df3);
        String mydate4 =dt.format(df4);
        // String mydate10 =d.format(df10);

        System.out.println(mydate);
        System.out.println(mydate1);
        System.out.println(mydate2);
        System.out.println(mydate3);
        System.out.println(mydate4);
        // System.out.println(mydate10);
    }
}
