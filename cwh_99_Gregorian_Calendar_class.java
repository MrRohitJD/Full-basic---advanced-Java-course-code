import java.util.Calendar;

public class cwh_99_Gregorian_Calendar_class {
    public static void main(String[] args) {
        Calendar cl =Calendar.getInstance();
        System.out.println(cl.get(Calendar.DATE)+ ":"+cl.get(Calendar.HOUR)+ ":"+cl.get(Calendar.MINUTE)+ ":"+cl.get(Calendar.SECOND));
        System.out.println(cl.getTime());
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.HOUR));  //print 2.00
        // System.out.println(cl.get(Calendar.HOUR_OF_DAY));   //print 14.00
        System.out.println(cl.get(Calendar.MINUTE));
        System.out.println(cl.get(Calendar.SECOND));

        System.out.println(" date :"+cl.get(Calendar.DATE)+ " hour "+cl.get(Calendar.HOUR)+ " minute "+cl.get(Calendar.MINUTE)+ " second "+cl.get(Calendar.SECOND));
        
        
    }
}
