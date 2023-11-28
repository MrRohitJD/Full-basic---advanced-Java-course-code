class mythrd5 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
             System.out.println("this is thread in rohit !!!");
             try{
                Thread.sleep(80);
             }
             catch(Exception e){
                System.out.println(e);
             }
            i++;
        }
        // System.out.println("this is thread in rohit !!!");
    }
}
// class mythrd6 extends Thread{
//     public void run(){
//         int i = 0;
//         while(i<50){
//             System.out.println("this is thread in aditya @@@$$");
//             i++;
//         } 
//         // System.out.println("this is thread in aditya @@@$$");
//     }
// }

public class cwh_75_Thread_Methods{
    public static void main(String[] args) {
        mythrd5 t5 = new mythrd5();
        // mythrd6 t6  = new mythrd6();
        t5.start();
       
        // try {
        //     t5.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // t6.start();
    }
}