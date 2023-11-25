package day19;

import java.util.Arrays;

public class Array2DExample2 {
    public static void main(String[] args) {
        int[][] a = { {2, 4, 6, 8}, {1, 2, 3, 4} };
        int [] [] b = new int[2][4];

        int [] sayilar = new int[50];

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = i;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=j;
            }
        }
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(sayilar));
    }
}
