package day19;

import java.util.Arrays;

public class Array2DExample {
    public static void main(String[] args) {
        String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };
                                    //R 0            , R 1              , R2
        String customer = seatingInfo[2][1];

        System.out.println(seatingInfo.length);
        System.out.println(seatingInfo[0].length);
        System.out.println(customer);

        String ad ="Jake";
        for (int i = 0; i < seatingInfo.length; i++) {
            for (int j = 0; j < seatingInfo[i].length; j++) {

                if (ad.equals(seatingInfo[i][j])){
                    System.out.println("Kisi bulundu");
                    System.out.println ("Row " +  i + "Column " + j);
                }


            }

        }


    }
}
