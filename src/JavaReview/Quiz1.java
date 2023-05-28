package JavaReview;

import java.util.Scanner;

public class Quiz1 {
    public static void main(StringExample[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi = scanner.nextInt();
        int toplam = 0;
        for (int i=1; i<sayi;i++){
            if (sayi%i==0){
                toplam +=i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if(toplam>sayi){
            System.out.println("abundant");
        }else if(toplam == sayi){
            System.out.println("perfect");
        }else{
            System.out.println("deficient");
        }
    }
}
