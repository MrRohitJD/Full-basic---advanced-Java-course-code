//QUSETION NO 01 AND 02.. 
// abstract class pen{
//     abstract public void write();
//     abstract public void refil();
//     abstract void changenipp();

// }
// class workPen extends pen{
//     public void write(){
//         System.out.println("write with Pen");
//     }
//     public void refil(){
//         System.out.println("refill pen right now");
//     }
//     void changenipp(){
//         System.out.println("change the nipp of the pan");
//     }
// }


 ///QUSETION NO 03..  

 interface BasicAnimal{
    public void eat();
    public void sleep();
 }
 class monkey{
    public void jump(){
        System.out.println("jummeped");
    }
    public void bite(){
        System.out.println("bited mango");
    }
 }
 class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eatiing");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
 }

public class cwh_60_Ex_Abstractt_class_interfaces {
    public static void main(String[] args) {
 ////QUSETION NO 01 AND 02.. 
        // workPen wp = new workPen(); 
        // wp.write();
        // wp.refil();
        // wp.changenipp();

 ///QUSETION NO 03..  
       human hm =new human();
       hm.eat();
       hm.sleep();
       hm.jump();
       hm.bite();

    }
}
