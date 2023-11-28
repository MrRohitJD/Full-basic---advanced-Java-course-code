class phone{
     public void ring(){
        System.out.println("phone is ringing...");
    }
    public void ring(int a){
        System.out.println("phone is ringing...");
    }

}
class smartphone extends phone{
     public void ring(){
        System.out.println("smart phone is ringing...");
    }
    public void ring(int a){
        System.out.println("smart phone is ringing...");
    }
} 
public class cwh_49_Dynamic_Method_Dispatch {
  public static void main(String[] args) {
    phone ph = new smartphone();
    ph.ring();    // output is smart phone is ringing...   CON NOT print phone is ringing... 
    //smartphone sc = new phone()               //this is not accepted in java 
  }
    
    
}
