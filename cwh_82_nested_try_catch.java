import java.util.Scanner;

public class cwh_82_nested_try_catch {
   public static void main(String[] args) {
        int arr[]  ={12,47,10,13,41,44,45};
        int len =arr.length;
        System.out.println(len);
        boolean flag = true;
        while(flag){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter index  ");
        int i =sc.nextInt(); 

            try{
                System.out.println("this is aditya");
                System.out.println(arr[i]);
                try{
                    System.out.println("this is rohit +1");
                    System.out.println(arr[i+1]);
                flag =false;            
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("number is greater than indx vlaue");
                }
            } 
            catch(Exception e){
                System.out.println("some error occured");
            }
        }
        System.out.println("End the program.........");

   } 
}
