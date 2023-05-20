package day16;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassObjectsReview {
    public static void main(String[] args) {

        Araba araba1 = new Araba();

        araba1.fiyat = 12000;
        araba1.marka = "Toyota";
        araba1.renk = "Gri";
        araba1.yil = 2018;


        System.out.println(araba1.marka);

        System.out.println("============");

        Araba araba2 = new Araba();

        araba2.fiyat = 15000;
        araba2.marka = "Mercedes";
        araba2.renk = "Beyaz";
        araba2.yil = 2017;

        araba2.calis();

        System.out.println(araba2);
        System.out.println(araba1);
        String [] arr = {"ali", "veli"};
        System.out.println(Arrays.toString( arr));



        Araba araba3 = new Araba();
        araba3.setInfo("Audi", "Kirmizi", 18000,2020);
        araba3.calis();
        Araba araba4 = new Araba();
        araba4.setInfo("Audi", "Beyaz", 20000,2021);
        System.out.println(araba3);
        System.out.println(araba4);

        ArrayList <Araba> arabaListesi = new ArrayList<>();

/*      arabaListesi.add(araba1);
        arabaListesi.add(araba2);
        arabaListesi.add(araba3);
        arabaListesi.add(araba4);*/

        arabaListesi.addAll(Arrays.asList(araba1,araba2,araba3,araba4));

        System.out.println(arabaListesi);

        for (Araba eleman: arabaListesi
             ) {
            System.out.println(eleman.marka);
        }

        for (Araba eleman: arabaListesi
        ) {
            if(eleman.fiyat>15000){
                System.out.println(eleman.marka + " : " + eleman.yil);
            }
        }


    }
}
