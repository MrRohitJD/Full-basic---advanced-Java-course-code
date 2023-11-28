
class phone2{
    public void myPhone(){
        System.out.println("this is a simple phone");
    }
}
interface gps1{
    void shereLocation();
    public void startLocation();

}
interface camera{
    void takesnap();
     default public void zoom(){
        System.out.println("camera lens zoom 4X");
     }
  }

class mySmartPhone extends phone2  implements gps1, camera{
    public void myPhone(){
        System.out.println("this is a simple phone");
    }
    public void shereLocation(){
        System.out.println("shering location");
    }
    public void startLocation(){
        System.out.println("starting your location");
    }
    public void takesnap(){
        System.out.println("click the snap");
    }
    // public void zoom(){
    //      System.out.println("zooming lens of camera"); //---- this is not throw error when this is commented becouse this method is default 
     }
public class cwh_59_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        gps1 g =new mySmartPhone();   //----> this obj only run for gps method other all method can we run thows error
        g.shereLocation();
        g.startLocation();

        // g.takesnap();  ----> throw Error g is only run for gps method
        // g.zoom();
    }
}
