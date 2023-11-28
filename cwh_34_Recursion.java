public class cwh_34_Recursion {
    
   static int  factorial(int  n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n* factorial(n-1);
        }
    }
    public static void main(String[] args) {
        //factorial (10);
        System.out.println("factorial is =" +factorial(10));

    }
}

   /*  static int fabbo(int n){
        if(n==0){
            return 0; 
        
        }
        if(n==1){
            return 1;
        }
        else{
            return fabbo(n-1)+fabbo(n-2);
        }
    }*/
        /*public static void main(String[] args) {
            
        
            System.out.println("Fibonacci sequence is"+fabbo(7));
        }
}

*/