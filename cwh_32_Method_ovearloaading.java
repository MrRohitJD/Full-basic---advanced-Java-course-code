//  static void . apply static void in arrays.
public class cwh_32_Method_ovearloaading {
    static void inface (int x){
     x = 100;
    }
    static void inface_01 (int [] x){
       x [0]= 100;
    }
    static void foo(int a ){
        System.out.println("hello Good morring bro" + a);
    }

    public static void main(String[] args) {
        // using integer.
        int a = 10;
        inface(a);
        System.out.println(a);

        //using array.
        int [] arr = {1, 2, 3, 4, 5, 6, 7, };
        inface_01(arr);
        System.out.println("after changing the arrya's element is :-"+ arr[0]);

        //
        foo(100);

    }
}
