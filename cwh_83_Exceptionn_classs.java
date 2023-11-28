import java.util.Scanner;

class myexte extends Exception{

    @Override
    public String getMessage() {
        return "i am getMessage";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }

}
public class cwh_83_Exceptionn_classs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        if(a<99){
            System.out.println("this is g than ");
        }
        else if(a<9){
            try {
                throw new myexte();
            } 
            catch (myexte e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
            System.out.println("end the program...");
            
        }
        
        
    }
}
