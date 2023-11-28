
import java.util.Scanner;

public class cwh_33_Variable_Arguments{
    /*static int k(int ...l){
        int Result =0;
        for(int e : l){
            Result +=  e;
        }
        return Result;
    
    public static void main(String[] args) {
        System.out.println("the sum of 5 and 4 is" + k (5,4,7));
        System.out.println("the sum of 5 and 4 is" + k (5,4,7,8)); 
        System.out.println("the sum of 5 and 4 is" + k(5,4,7,8,9));
        System.out.println("the sum of 5 and 4 is" + k(5,4,7,8,9,10));
        System.out.println("the sum of 5 and 4 is" + k(5,47,8,9,10,11));




    }*/
    static int foo(int... arr){
        int Result=0;
        for(int element: arr){
            Result += element;
        }
        return Result;
    }
    public static void main(String[] args) {
        Scanner ab =new Scanner(System.in);
       // Scanner ab =new Scanner(System.in);
        int a;
        a= ab.nextInt();
       int b;
       b=ab.nextInt();
       int c;
        c= ab.nextInt();
       int d;
       d=ab.nextInt();
        System.out.println("sum is "+(a+b+c+d));
        ab.close();
    }
}