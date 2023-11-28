
class sub{
    public int a;
    public int b;
    public sub(int a ,int b){
        this.a=a;
        this.b=b;

    }
    public void s(){
        int d = a-b;
        System.out.println("this sub "+d);
    }


}
public class cwh_105_Generating_JavaDocs {
    public static void add(int s ,int r){
        int t  =s+r;
        System.out.println("this is add "+t);
    }
    public static void main(String[] args) {
        System.out.println("this is java docs in learning stage");
        sub sub= new sub(52, 2);
        sub.s();
        add(10,20);
    }
}
