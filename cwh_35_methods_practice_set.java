//import java.util.Scanner;
public class cwh_35_methods_practice_set {

        //  PRACTICE PROBLEM 01
    static void multi(int x){
        for(int i=1; i<11; i++){
             //System.out.println(i*x);
             System.out.format("%d X %d =%d\n", i,x, i*x);
        }
    }  
    // PRACTICE PROBLEM 02
    /*static void stars(int n){
         for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }*/
        // PRACTICE PROBLEM 03
       /*static  int sumRec(int n){
            if(n==1){
                return 1 ;
            }
            else{
               return n + sumRec(n-1) ;
            }
            
        }*/

        // PRACTICE PROBLEM 04
        /*static void stars(int n){
            System.out.println("*");
            for(int i=1; i<n-i; i++){
               for(int j=0; j<i; j++){
                   System.out.print("*");
               }
               System.out.println("*");
            }
            //System.out.println("*");
       }*/
       /*static int fib(int n){
        if(n==1){
            return 0;  
       }
       else if(n==2){
        return 1;
       }
       else{
        return(n-1)+(n-2);
       }
       }   */


       // PRACTICE PROBLEM 06
       /*static float average(float...marks){
        float total=0;
        for (float scan:marks){
            total+=scan;
        }
        System.out.println(total/ marks.length);
        return total;
    }*/
    /*static void sum_is(int a){
        int sumo = 0;
        for(int i=0; i<a; i++){
             sumo += i;
        }
        System.out.println(sumo);
    }*/
    /*static  void c(int a){
        if(a==0){
           System.out.println("-40");
        }
        else{
            System.out.println(1.8*a+32);
            
        }


    } */
    public static void main(String[] args) {
     //PRACTICE PROBLEM 01
      multi(6);

     // PRACTICE PROBLEM 02
    // stars(4);

    // PRACTICE PROBLEM 03
     //int c = sumRec(4);
     //System.out.println(c);


    // PRACTICE PROBLEM 04
    //stars(6);

    // PRACTICE PROBLEM 05
      //int result = fib(7);
      //System.out.println(result);

     // PRACTICE PROBLEM 06
     //float tt=average(1,2,3,4);

     // PRACTICE PROBLEM 06
     //sum_is(8);
     
       //Scanner sc= new Scanner(System.in);
       //int d = sc.nextInt();
       //System.out.println("celsius is" +d+ "fahrenheit is" +a);
       //c(45);

    }
}    
