package day19;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        // siniftaki ogrencilerin yasi
        int [] yas  = new int[10];


        int [] [] storage = new int[2][3];
        String ad = "Ali";
                    //A=0 l =1 i 2
        System.out.println(ad.length());

        storage[0][0] = 5;
        System.out.println(Arrays.toString(storage[0]));

        String[][] seatingChart;

        seatingChart =  new String [3][2];

        seatingChart[0][0] = "Jamal";

        seatingChart[1][0] = "Jacob";
        seatingChart[1][1] = "Suzy";
        seatingChart[2][0] = "Emma";
        seatingChart[2][1] = "Luke";

        System.out.println(Arrays.toString(seatingChart[0]));

    }
}
