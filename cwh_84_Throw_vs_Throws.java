class distanceNotNegative extends Exception{

    @Override
    public String getMessage() {
        return "Not Enter nagetive Value";
    }

    // @Override
    // public void printStackTrace() {
    //     super.printStackTrace();
    // }

    @Override
    public String toString() {
        return "Not Enter nagetive Value";
    }

}

public class cwh_84_Throw_vs_Throws {
    public static int displesment(int distance,int time) throws distanceNotNegative{
        if(distance<1){
            throw new distanceNotNegative();
        }
        int displesment = distance/time;
        return displesment;
    }
    public static void main(String[] args) {
        // System.out.println(displesment(0, 0));
        try{
            int d =displesment(-2, 3);
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println("Program is end new");

    }
}