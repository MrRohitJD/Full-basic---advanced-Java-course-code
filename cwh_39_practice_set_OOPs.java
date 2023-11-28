//import java.util.Scanner;
//  PRACTICE PROBLEM 01
/*class employee{
    int salary;
    String name;
    public int GetSalaray(){
        return salary;
    }
    public String GetName(){
        return name;
    }
    public void SetName(String n){
        name = n; 
    }
}*/

//  PRACTICE PROBLEM 02
/*class cellphone{
    static void Ring(){
        System.out.println("Ringing...");
    }
    static void call(){
        System.out.println("calling....");
    }
    static void callMyfrined(){
        System.out.println("call my Friend ");
    }
}*/

//  PRACTICE PROBLEM 03
/*class squre{
    int side ;
    public int area(){
        return side*side;
    }
    public int paramater(){
        return 4*side;
    }
    
}*/
/*class rectangle{
    int width;
    int lenght;
    public int area(){
        return width*lenght;
    }
    public int paramater(){
        return (2*width)+(2*lenght);
    }
}*/
/*class tonny{
    public void hit(){
        System.out.println("hitting th enemy");
    }
    public void run(){
        System.out.println("running from enemy");
    }
    public void firring(){
        System.out.println("firring th enemy");
    }
}*/
class circle{
    float radi;
    public float area(){
        return 3.14f*2f*radi;
    }
    public float paramater(){
        return 2f*3.14f*radi;
    }
}

public class cwh_39_practice_set_OOPs {
    public static void main(String[] args) {
       /*employee aadi =new employee();
        aadi.SetName("RohitJadhav");
        aadi.salary =222;
        System.out.println(aadi.GetName());
        System.out.println(aadi.GetSalaray());*/

     //  PRACTICE PROBLEM 02
        /*cellphone apple =new cellphone();
        apple.call();
        apple.Ring();
        apple.callMyfrined();*/
        
     //  PRACTICE PROBLEM 03
        /*squre qulity = new squre();
        qulity.side =3;
         System.out.println("area of squre is = "+qulity.area());
         System.out.println("paramater of squre is = "+qulity.paramater());*/
       
     
      //  PRACTICE PROBLEM 04
      /*rectangle rect =new rectangle();
      rect.width = 23;
      rect.lenght = 44;
      System.out.println(rect.area());
      System.out.println(rect.paramater());*/

     /*tonny t = new tonny();
      t.run();
      t.hit();
      t.firring(); */

      circle cr=new circle();
      cr.radi =45;
      System.out.println(" area of circle is "+cr.area()); 
      System.out.println(" paramater of circle is "+cr.paramater());

    }
    
}



