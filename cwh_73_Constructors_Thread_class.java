class mytrd extends Thread{
    public mytrd(String name){
        super(name);
    }
    public void run(){
        System.out.println("this is rohit");
        for(int i=0;i<10; i++){
            System.out.println(i);
        }
    }
}
public class cwh_73_Constructors_Thread_class {
    public static void main(String[] args) {
        mytrd t1 = new mytrd("aditya");
        mytrd t2 = new mytrd("rohit");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("this is id of t2  " +t1.getName());

        System.out.println("this is id of t2 is " +t2.getId());
        System.out.println("this is name of t2 is " +t2.getName());

    }
}
