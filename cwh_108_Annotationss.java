import java.util.Scanner;

class Annotationss extends phone2{
    // public void myone(){
    //     System.out.println("this is !!!! phone");
    // }  /// asi chuki hovu nye mhanun @Override napraych.
    @Override
    public void myPhone(){
        System.out.println("this is !!!! phone");
    }
}

public class cwh_108_Annotationss {
    public static void add(){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        Annotationss a=new Annotationss();
        a.myPhone();
        
    }
}
