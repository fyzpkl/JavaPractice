package day15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArabaNesne {
    public static void main(String[] args) {
        Arabalar araba1 = new Arabalar();
        araba1.marka = "Toyota";
        araba1.motor= 2.4f;
        araba1.renk = "Yesil";
        araba1.yil=2012;

        System.out.println(araba1.marka);
        araba1.hizlan();
        araba1.hizlan();
        araba1.fren();
        Arabalar araba2 = new Arabalar();

        araba2.marka = "Honda";
        araba2.motor= 2.4f;
        araba2.renk = "Kirmizi";
        araba2.yil=2015;
        araba2.fren();

        System.out.println(araba1);

        Arabalar araba3 = new Arabalar();

        araba3.setInfo("Mazda",2.0f,"mavi",2017);

        ArrayList <Arabalar> arabaListe = new ArrayList<>();

        //arabaListe.add(araba1);
       // arabaListe.add(araba2);
        //arabaListe.add(araba3);

        arabaListe.addAll(Arrays.asList( araba1,araba2,araba3));

        System.out.println(arabaListe);

        for (Arabalar each:arabaListe
             ) {
                if(each.yil>= 2015){
                    System.out.println(each.marka + " : "+ each.yil);
            }
        }

    }
}
