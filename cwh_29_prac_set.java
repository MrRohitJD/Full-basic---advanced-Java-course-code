//import javax.sound.sampled.SourceDataLine;
//import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

// import java.util.Scanner;

public class cwh_29_prac_set {
    public static void main(String[] args) {
        // PRACTICE PROBLEM 01
        /*
         * float[] marks = { 45.2f, 55.5f, 78.2f, 44.5f };
         * float sum = 0;
         * for (float element : marks) {
         * sum = sum + element;
         * }
         * System.out.println("Sum of all marks is" + sum);
         */

        // PRACTICE PROBLEM 02
        /*
         * float[] marks = { 45.2f, 55.5f, 78.2f, 44.5f };
         * float num = 40.22f;
         * boolean isInArray = true;
         * for (float element : marks) {
         * if (num == element) {
         * isInArray = true;
         * break;
         * 
         * }
         * }
         * if (isInArray) {
         * System.out.println("the vlaue is presend in array");
         * 
         * } else {
         * System.out.println("the vlaue is not presend in array");
         * }
         */

        // PRACTICE PROBLEM 02 INPUT FROM USER.

        /*
         * System.out.println("Enetr the arryas element");
         * Scanner sc = new Scanner(System.in);
         * float num = sc.nextFloat();
         * float[] marks = { 45.2f, 55.5f, 78.2f, 44.5f };
         * booleans isInArray = fale;
         * for (float element : marks) {
         * if (num == element) {
         * isInArray = true;
         * break;
         * 
         * }
         * }
         * if (isInArray) {
         * System.out.println("the vlaue is presend in array");
         * } else {
         * System.out.println("the vlaue is not presend in array");
         * }
         */

        // PRACTICE PROBLEM 03

        /*
         * * int[] marks = { 55, 68, 99, 55, 45, 87, };
         * int sum = 0;
         * for (int element : marks) {
         * sum = sum + element;
         * }
         * System.out.println("Averege of Total marks is " + sum / marks.length);
         */

        // PRACTICE PROBLEM 04
        /*
         * int[][] mat1 = { { 4, 7, 6 }, { 9, 5, 10 } };
         * int[][] mat2 = { { 7, 8, 6 }, { 11, 7, 8 } };
         * int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
         * 
         * for (int i = 0; i < mat1.length; i++) { // row number of times
         * for (int j = 0; j < mat1[i].length; j++) { // column number of time
         * System.out.format(" Setting value for i=%d and j=%d\n", i, j);
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * }
         * 
         * for (int i = 0; i < mat1.length; i++) {
         * for (int j = 0; j < mat1[i].length; j++) {
         * System.out.print(result[i][j] + " ");
         * result[i][j] = mat1[i][j] + mat2[i][2];
         * 
         * }
         * System.out.println("");
         * }
         */

        // PRACTICE PROBLEM 05

         /*int[] arr = { 1, 2, 3, 664 };
        int l = arr.length;
        int a = Math.floorDiv(l, 2);
        int temp;

        for(int i = 0; i <= a; i++) {
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element: arr) {
            System.out.print(element + " ");
        }*/


        // PRACTICE PROBLEM 06

        /*int[] arr = { 1, 2, 3, 664, 5 ,56, 21, 1000 };
        int max = Integer.MIN_VALUE;
        for(int e :arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("max value of arryas elemet is " +max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/
      
       // PRACTICE PROBLEM 07

       /*int [] arr ={ 1, 2, 3, 664, 5 ,56, 21, 1000};
       int min = Integer.MAX_VALUE;

       for(int e :arr){
        if(min>e){
            min=e;
        }
       }
       System.out.println("Min vlaue in array" + min);
       System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/


        //PRACTICE PROBLEM 07
        int [] arr ={ 1, 2, 23, 15,};
        boolean issorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] >arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }

}
