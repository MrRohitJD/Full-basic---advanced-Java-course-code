import java.util.Scanner;

public class cwh_81_Handling_Speci_Exceptions {
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10,12,14};
        System.out.println(arr[1]);


        Scanner sc =new Scanner(System.in);
        System.out.println("entre f vlaue");
        int a =sc.nextInt();
        // System.out.println("entre s vlaue");
        int b =sc.nextInt();

        try{
            System.out.println("enter first vlaue" +arr[a]);
            System.out.println("enter secound vlaue" +arr[b]);
            System.out.println("after div value is " +arr[a]/b);
            // System.out.println("after div value is " +a/b);
        }
        catch(ArithmeticException e){
            System.out.println("invalid input");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid input");
            System.out.println(e);
        }
        catch(OutOfMemoryError e){
            System.out.println("memory inseficient");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception");
            System.out.println(e);
        }
        sc.close();

    }
}

