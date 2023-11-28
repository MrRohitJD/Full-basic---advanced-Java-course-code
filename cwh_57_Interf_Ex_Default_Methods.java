
class phone1{
    public void myPhone(){
        System.out.println("this is a simple phone");
    }
}
interface gps{
    void shereLocation();
    public void startLocation();

}
interface camera{
    void takesnap();
     default public void zoom(){
        System.out.println("camera lens zoom 4X");
     }
  }

class mySmartPhone extends phone2  implements gps, camera{
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
    // }

}
public class cwh_57_Interf_Ex_Default_Methods {
    public static void main(String[] args) {
       mySmartPhone sp =new mySmartPhone();
       sp.myPhone();
       sp.shereLocation();
       sp.startLocation();
       sp.takesnap();
       sp.zoom();
        
       
    }
}
