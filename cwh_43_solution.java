/*import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class Game01 {
    private int computerNumber;
    private int numberOfGuesses;
    Scanner sc=new Scanner(System.in);

    Random rn = new Random();

    public Game01(){
        computerNumber = rn.nextInt(101);
    }
    public int takeUserInput(){
        System.out.println("Guess the number ()1-101:");
        int usernum =sc.nextInt();
        return usernum;
    }
    public boolean iscorrnum(int myNumber){
        int  flag =0;
        if(myNumber<=100 && myNumber>=0){
            setNumberOfGuesses();
            if(myNumber==computerNumber){
                System.out.println("the right number well done");
            }
            else if(myNumber<computerNumber){
                System.out.println("Your number is less than the actual number");
            
            }
            else if(myNumber>computerNumber){
                System.out.println("Your number is greater than the actual number");
            }
        }
    
    } 

    }
}
public class cwh_43_solution {
   
}*/
