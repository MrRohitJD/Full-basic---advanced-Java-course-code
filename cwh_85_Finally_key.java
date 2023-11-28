public class cwh_85_Finally_key{
    public static int finnally(){
        int a=10;
        int b=9;
        int c= a/b;
        try{
            System.out.println(c);
  
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("cleaniing up of resources");
        }
        return c;

        

    }
    public static void main(String[] args) {
        System.out.println(finnally());


        int a=10;
        int b=9;
        int c= a/b;
        try{
            System.out.println(c);
  
        }
        finally{
            System.out.println("cleaniing up of resources");

            /// finally also use if catch is written in code 
        }
    }
}