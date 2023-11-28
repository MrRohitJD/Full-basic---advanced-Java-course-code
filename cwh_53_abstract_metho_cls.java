abstract class perent{
   public perent(){
    System.out.println("I am abstract perent class construter");
   }
   abstract public void hey();
   abstract public void hii();
   
}   
class child extends perent{
    public void hey(){
        System.out.println("hey  i am child");
    }
    public void hii(){
        System.out.println("hii  i am child");
    }
} 
class child01 extends perent{
    public void hello(){
        System.out.println("hello i am child01");
    }
    public void hey(){
        System.out.println("hey  i am child01");
    }
    public void hii(){
        System.out.println("hii  i am child01");
    }
 }
 abstract class child02 extends perent{
    public void fox(){
        System.out.println("I am child 02");
    }

 }
public class cwh_53_abstract_metho_cls {
    public static void main(String[] args) {
         //perent pr =new perent();  --- get error
        child cd = new child(); 
        child01 cd1 =new child01();
        //child02 cd2 =new child02() ; --- get error
        cd.hey(); 
        cd.hii();
        cd1.hello();
        cd1.hey();
        cd1.hii();
                 
    }
}
