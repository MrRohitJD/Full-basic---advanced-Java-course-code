class ThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<80){
            System.out.println("adi!!!!!!!!");
            i++;
        }
    }
}

class ThreadRunnable2 implements Runnable{
    public void run(){
        int i=0 ;
        while(i<85){
            System.out.println("Rohit &&&&&&");
            i++;
        }
    }
}


public class cwh_71_Thread_Runnable_Interface {
    public static void main(String[] args) {
        // ThreadRunnable1 bullet1 =new ThreadRunnable1();
        // Thread  gun1 = new Thread(bullet1);


        // ThreadRunnable2 bullet2 = new ThreadRunnable2();
        // Thread gun2  = new Thread(bullet2);

        // gun1.start();
        // gun2.start();

        ThreadRunnable1 t1 = new ThreadRunnable1();
        Thread r1 = new Thread(t1);

        ThreadRunnable2 t2 =new ThreadRunnable2();
        Thread r2 =new Thread(t2);

        r1.start();
        r2.start();;
    }
}
