package day15;

import java.util.Arrays;

public class KopekObjesi {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek();
        kopek1.isim = "Mavi";
        kopek1.yas = 3;
        kopek1.yemekYe();
        System.out.println(kopek1.isim);

        Kopek kopek2 = new Kopek();

        kopek2.isim = "sari";
        kopek2.yas = 5;
        kopek2.yemekYe();
        System.out.println(kopek2.isim);
        
        Kopek kopek3 = new Kopek();
        kopek3.setInfo(3,"Jo","X");

        System.out.println(kopek3);
    }
}
