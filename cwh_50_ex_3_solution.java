import java.util.Random;
import java.util.Scanner;
class game{
     public int number;
     public int numOfGuess;
     public int inputNum;


    // public int getnumOfGuess(){
      //  return numOfGuess;
        
     //}
    // public void setnumOfGuess(int numOfGuess){
       // this.numOfGuess =numOfGuess;
     //}


     game (){
     Random rand  = new Random();
     this.number = rand.nextInt(100);
     }

     void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        inputNum = sc.nextInt();
     }
     boolean isCorrectNumber(){
        numOfGuess++;
        if(inputNum==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, numOfGuess);
            return true;
        }
        else if(inputNum>number){
            System.out.println("is higher than real number");
        }
        else if(inputNum<number){
            System.out.println("is lesser than real number");
        }
     return false;
    }
   
}
public class cwh_50_ex_3_solution {
    public static void main(String[] args) {
          /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
        game g =new game();
        boolean b = false;
        while(!b){
        g.takeUserInput();
        b= g.isCorrectNumber();
        }

        
        
                 
    }
}
