

import java.util.Scanner;

public class cwh_86PractSet_Errors_Excep {
    public static void main(String[] args) {
// ------------------1st problem-----------------------------------
//        int  =45;  -------syntax error
//        System.out.println(11/1);  ----kay print kraysach hot aahi kya print zal(logical error)
//        System.out.println(11/0);   ----runtime error

     // -----------------------2st problem-----------------------------
//        try{
//            System.out.println(12/1);
//        }
//        catch (ArithmeticException e){
//            System.out.println("haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("haha");
//        }
        // -----------------------3rd problem-----------------------------
        int arr []={1,45,25,35,56,74};
        Scanner sc =new Scanner(System.in);
        int i =0;
        boolean flag =true;
        while(flag && i<5){
            try {
                i = sc.nextInt();
                System.out.println(arr[i]);
//                break;
                flag =false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("error");
                i++;
            }
            if(i==4){
                System.out.println("aditya error");
            }

        }
    }

}

