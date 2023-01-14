package day10;

import java.util.Scanner;

public class CustomMethodsEx3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Min giriniz");
        int min = sc.nextInt();

        System.out.println("Max giriniz");
        int max = sc.nextInt();

        arasiniTopla(min,max);
    }
    public static void arasiniTopla(int sayi1,int sayi2){
        int topla=0;
        for (int i = sayi1; i <=sayi2 ; i++) {
            topla+=i;
        }
        System.out.println("toplam = " + topla);

    }

}
    //create a function that can print all the numbers between X and Y