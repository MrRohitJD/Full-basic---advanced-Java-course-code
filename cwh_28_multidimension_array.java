//import javax.sound.sampled.SourceDataLine;

public class cwh_28_multidimension_array {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 200;
        flats[0][2] = 300;
        flats[1][0] = 400;
        flats[1][1] = 500;
        flats[1][2] = 600;
        System.out.println("printing 2 -D arrays using  for loop ");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.printf(" ");

            }
            System.out.println(" ");
        }

    }

}

/*
 * public class cwh_28_multidimension_array {
 * public static void main(String[] args) {
 * // int [] marks; // A 1-D Array
 * int[][] flats; // A 2-D Array
 * flats = new int[2][3];
 * flats[0][0] = 101;
 * flats[0][1] = 102;
 * flats[0][2] = 103;
 * flats[1][0] = 201;
 * flats[1][1] = 202;
 * flats[1][2] = 203;
 * 
 * // Displaying the 2-D Array (for loop)
 * System.out.println("Printing a 2-D array using for loop");
 * for (int i = 0; i < flats.length; i++) {
 * for (int j = 0; j < flats[i].length; j++) {
 * System.out.print(flats[i][j]);
 * System.out.print(" ");
 * }
 * System.out.println("");
 * }
 * 
 * }
 * }
 */
/*public class cwh_28_multidimension_array {
    public static void main(String[] args) {
        int[][] num;
        num = new int[2][2];
        num[0][0] = 10;
        num[0][1] = 20;
        num[1][0] = 30;
        num[1][1] = 40;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }

}*/
/*public class cwh_28_multidimension_array {
    public static void main(String[] args) {
        string [][] strii =new string [2][2];
        string [0][0] = "adii";
        string [0][1] = "bdii";
        string [1][0] = "cdii";
        string [1][1] = "ddii";
        for(string i=0)

    }
}*/

/*public class cwh_28_multidimension_array {
    public static void main(String[] args) {
        int[] marks = { 5, 65, 55, 56, };
        System.out.println(marks.length);
        // System.out.println(marks[3]);
        for (int element : marks) {
            System.out.println(element);
        }

    }
}*/
