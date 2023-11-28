import java.util.ArrayDeque;



public class cwh_93_arraydeque {
    public static void main(String[] args) {
       
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ArrayDeque<Integer> ad2= new ArrayDeque<>();

        ad.add(74);
        ad.add(54);
        ad.add(61);

        ad.add(9);
        ad.add(8);
        ad.add(7);
        ad.addAll(ad2);
        // System.out.println(ad.contains(61));
        System.out.println(ad.element());
        System.out.println(ad.isEmpty());
        System.out.println(ad.peek());
        // ad.clear();
        // System.out.println(ad.getFirst());
        // System.out.println(ad.getLast());

        // for (Integer element : ad) {
        //     System.out.println("Element : " + element);
        // }
        System.out.println("end of the program");
        

    }
}
