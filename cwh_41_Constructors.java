
class employee01{
    private int Id;
     private String name;
     //private String banch;
   
     //public employee01(String NName , int MyId ){
       // name  = NName;
       // Id =MyId;
     
        public employee01(String NName ,   int MyId ){
            name  = NName;
            Id =MyId;
        }

     public int GetId(){
        return Id;
     }
     public void SetId(int i){
        this.Id=i;
     }
     public String GetName(){
        return name;
     }
     public void SetName( String n){
       this.name=n;
     }

}
public class cwh_41_Constructors{
   public static void main(String[] args) {
    employee01 bib = new employee01("aditya", 988 );
    //bib.SetId(12);
   //bib.SetName("RohitJadhav");
    System.out.println(bib.GetId());
    System.out.println(bib.GetName());
    
   }
}


