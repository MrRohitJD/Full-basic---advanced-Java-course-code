class mytrd1 extends Thread{
    public mytrd1(){

    }
    public void run(){
       for(int i=0;i<10; i++){
        System.out.println("I am a thread");
        System.out.println("Thank you: " + this.getName());
       }
    }
}

public class cwh_74_Thread_Priorities {
    public static void main(String[] args) {
        mytrd1 t1 = new mytrd1();
        mytrd1 t2 = new mytrd1();
        mytrd1 t3 = new mytrd1();
        mytrd1 t4 = new mytrd1();
        mytrd1 t5 = new mytrd1();

        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);        

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
