public class cwh_31_Methods {
    static int logic (int x , int y){
        int z;
        if(x>y){
            z = x*y;
        }
        else{
            z= (x+y)/2;
        }
        return z ;

    }
public static void main(String[] args) {
        int a=90;
        int b=80;
        int c;
    c = logic(a ,b );
    System.out.println(c);
    int a1=455;
    int b1=11;
    int c1;
    c1 = logic(a1, b1); 
    System.out.println(c1);
}
}

    

