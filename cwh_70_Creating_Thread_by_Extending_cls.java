// import java.util.*;
// import java.io.*;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("!!!!!!");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("$$$");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class cwh_70_Creating_Thread_by_Extending_cls {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}