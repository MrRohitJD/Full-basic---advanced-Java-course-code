
import java.util.*;
public class cwh_98_Calendar_Class{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.getFirstDayOfWeek());
    }
}