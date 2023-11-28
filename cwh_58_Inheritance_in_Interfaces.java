
class oneClass{
    public void oneClass01(){
    System.out.println("this is a oneClass ");
    }
}
interface oneInterface{
    public void simple01();
    public void simple02();
}
interface secInterface extends oneInterface{      // extending interface 
    public void simple03();
    public void simple04();
}
class secoundClass extends oneClass implements secInterface{
    public void simple01(){
        System.out.println("simple01");
    }
    public void simple02(){
        System.out.println("simple02");
    }
    public void simple03(){
        System.out.println("simple03");
    }
    public void simple04(){
        System.out.println("simple04");
    }
}

public class cwh_58_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        secoundClass sc =new secoundClass();
        sc.simple01();
        sc.simple02();
        sc.simple03();
        sc.simple04();
    }
}
