//import java.util.*;
// 1st, 2nd , 3rd Quetions
class cylender{

    private int rudii;
   private int heighet;

    public cylender(int rd, int heightt){   // constracter
        this.rudii =rd;
        this.heighet =heightt;


    }
      public int Getrudii(){
     return rudii;
      }

      public void Setrudii(int n){
        rudii=n;
      }
    public int Getheighet(){
        return heighet;
        }
    //area = 2 · π · r · (r + h)
        public void Setheighet(int n){
            heighet=n;
        }
        public double areaOfCylender(){
            return  2*Math.PI*rudii*(rudii+heighet);
            
        }
        //π · r2 · h
        public double VolumeOfCylender(){
            return Math.PI*2*rudii*heighet;
        }

}
public class cwh_44_pract_set_getter_setter{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int dd = sc.nextInt();


         cylender all =new cylender(9 , 12);
         /*all.Setrudii(88);
         int f =all.Getrudii();
         //System.out.println( "redius is"+f);*/

         /*all.Setheighet(88);
         int h =all.Getheighet();
         System.out.println(h);*/

         System.out.println("area of cylender is ="+all.areaOfCylender());
         System.out.println("volume of cylender is ="+all.VolumeOfCylender());         
         
        }
    }







