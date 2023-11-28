interface annoDoemo{
    public void meth1(int a);
    // public void meth2();
}

public class cwh_109_Anonymous_Classes_Lambda {

    public static void main(String[] args) {
// -----------------------Anonymous Classes-----------------------------
        // annoDoemo obj = new annoDoemo() {

        //     @Override
        //     public void meth1() {
        //         System.out.println("this is meth1 ");
        //     }
        //     @Override
        //     public void meth2() {
        //         System.out.println("this is meth1 ");
                
        //     }
        // };
        // obj.meth1();
        // obj.meth2();

// --------------------------Lambda Expressions-------------------- 
    annoDoemo obj = (a) ->{System.out.println("this is lamda function of inteface annoDoemo of meth methiod "+a);};
    obj.meth1(10);
        
    }
}
