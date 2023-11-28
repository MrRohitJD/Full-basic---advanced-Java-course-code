class base {
    public int X;

    public int getX(){
        return X;
    }
    public void setX(int n){
        this.X = n;
    }
}
class Derived extends base{
    public int Y;

    public int getY(){
        return Y;
    }
    public void setY(int k){
        this.Y = k;
    }
}
public class cwh_45_inheritence {
    public static void main(String[] args) {
        base b = new base();
        b.setX(99);
        //b.setY(9);
        System.out.println(b.getX());

        Derived d =new Derived();
        d.setX(3343);
        d.setY(9);
        b.setX(811488);
        System.out.println(d.getY());
        System.out.println(d.getX());
        System.out.println(b.getX());
        
    }
}
