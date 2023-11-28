class base1{
    base1() { ///constutor
        System.out.println("I am a base classs constutor "); 
    }
     public base1(int x){
        System.out.println("I am a overloaded base class constuter with value with x" +x);
     }
}


class Derived1 extends base1{
    public int y;
     Derived1(){
        System.out.println("I am a derived class constuter");
    }

    Derived1(int x ,int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
     
}
 class childOfDerived extends Derived1{
    public childOfDerived(){
        System.out.println("I am a  childOfDerived class constuter");
    }
    public childOfDerived(int x, int y, int z){
        //super(x,y);
        System.out.println("I am an overloaded constructor of childOfDerived with value of z as: " + z);
    }
 }
public class cwh_46_Constructors_in_Inher {
    public static void main(String[] args) {
        // for base1
      // base1 b = new base1();
       //System.out.println(b);

       //for derived class
     // Derived d =new Derived();

     childOfDerived cd = new childOfDerived(1,2,3);
     System.out.println(cd);
    
        
    }
    
}
