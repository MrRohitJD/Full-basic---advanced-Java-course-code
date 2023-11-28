import java.util.LinkedList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(4);


        l.addLast(455);
        System.out.println(l);
        l.addFirst(1245);
        System.out.println(l);
        System.out.println(l.contains(2));         // 2 he aahe ka he bghatay he
        l.addAll(0,l2);                        // l+l2
        System.out.println(l.clone());
        System.out.println(l.indexOf(4));          // index kay aahe 4 cha
        System.out.println(l.lastIndexOf(4));      //index baghatay pn magun
        System.out.println(l);
        System.out.println(l.remove(1));        //index 1 chya element remove krtay
        l.set(1, 400);                  // index 1 vr 400 set krtay
        System.out.println(l.subList(1, 4));
        System.out.println(l);
         System.out.println(l.get(0));
        for(int i=0;i<l.size();i++){
            System.out.println(" "+l.get(i));
        }
    }

}
