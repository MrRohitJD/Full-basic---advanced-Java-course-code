/*class emloyee{
    int id;
    String name;
    int  salary;
    public void printDetsils(){
        System.out.println("my id is " + id );
        System.out.println( "and my name is " + name);
        
    }
    public int GetSalaray(){
        return salary;
    }
}


public class cwh_38_Creating_java_Class {
    public static void main(String[] args) {
        System.out.println("you are emloyee");
        emloyee rahul =new emloyee();
        rahul.id =12;
        rahul.salary =220;
        rahul.name = "CodeWithharry"; 
    rahul.printDetsils();

    int salary = rahul.GetSalaray();
System.out.println("is a "+salary);

    }
    
}*/

class aditya{
    int Roll_No;
    String name;
    int mark;
    public String namee(){
        return name;
         
    }
    public void StudentDetelais(){
        System.out.println("Your Roll Numbrer is " +Roll_No);
        System.out.println("your marks is " +mark);
    }
    

}
public class cwh_38_Creating_java_Class{
 public static void main(String[] args) {
    System.out.println("you are a student");
    
    aditya koli =new aditya();
    koli.Roll_No= 24;
    koli.mark=500;
    koli.name="Rohit sharma";
    String name = koli.namee();
    System.out.println("you are name is "+ name);
    koli.StudentDetelais();
    

 }
}