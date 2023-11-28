class myemployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public String setName(String n){
        return name = n;
    }
    public int GetId(){
        return id;
    }
    public int setId(int n){
        return id=n;
    }

}
public class cwh_40_Access_modifiers {
    public static void main(String[] args) {
        myemployee rohit = new myemployee();
        rohit.setName("CodeWithAditya");
        System.out.println(rohit.getName());
        rohit.setId(800);
        System.out.println(rohit.GetId());       
    }
}
