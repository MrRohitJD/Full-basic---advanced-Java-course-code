import java.util.HashSet;

public class cwh_94_hashsET {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(25);
        hs.add(20);
        hs.add(65);
        hs.add(25);
        hs.add(100);
        System.out.println(hs);
        for(int ele:hs){
            System.out.print(+ele+", ");
        }
    }
}
