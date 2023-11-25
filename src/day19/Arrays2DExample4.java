package day19;

public class Arrays2DExample4 {
    public static void main(String[] args) {
        int [] [] sayilar = {{1,2,3,4},
                {10,20,30,40},//
                {1,2,3,4},
                {1,2,3,4}};
        int toplam = 0;
        for (int i = 0; i < sayilar[1].length; i++) {
            toplam+=sayilar[1][i] ;
        }
        System.out.println("toplam = " + toplam);


    }
}
