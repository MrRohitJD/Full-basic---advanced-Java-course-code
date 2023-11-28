import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_Advanced_Prac_Set {
    public static void main(String[] args) {

// -------------------QUESTION 1---------------------------
        ArrayList<String> al =new ArrayList<>();
        al.add("aditya");
        al.add("rohit");
        al.add("adi");
        al.add("rohini");
        al.add("chandrakant");
        al.add("neeta");
        al.add("adu");
        al.add("roky");
        al.add("jonn");
        al.add("kumar");
        // for(String a:al){
        //     System.out.print(a+"  ,");
            
        // }

        // -------------------QUESTION 2---------------------------
        Date d  =new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar d1=Calendar.getInstance();
        System.out.println(d1.get(Calendar.HOUR_OF_DAY)+ ":"+d1.get(Calendar.MINUTE)+":"+d1.get(Calendar.SECOND));

        LocalTime t =LocalTime.now();
        DateTimeFormatter de = DateTimeFormatter.ofPattern("H:m:s");
        // String mydate =t.fo


        // -------------------QUESTION 5---------------------------
        HashSet <Integer> h =new HashSet<>();
        h.add(4);
        h.add(56);
        h.add(25);
        h.add(4);
        h.add(80);
        h.add(80);

        System.out.println(h);
        // for(int a:h){
        //     System.out.println(a);
        // }
    }
}
