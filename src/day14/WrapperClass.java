package day14;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        short sayi3 =15;

        int sayi4 = sayi3;



        Byte sayi = (byte)sayi3;

        int sayi2 = sayi;

        int [] sayilar  = new int[5];

        sayilar[0]=num;
        sayilar[1]= sayi;
        sayilar[2]= sayi2;

        System.out.println("sayilar = " + Arrays.toString( sayilar));
    }
}
