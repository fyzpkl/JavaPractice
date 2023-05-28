package JavaReview;

import java.util.Scanner;

public class QuizAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sayi");
        int sayi1 = scanner.nextInt();
        System.out.println("2. Sayi");
        int sayi2 = scanner.nextInt();
        System.out.println("Hangi islemi yapmak istersiniz + - * /");
        String karakter = scanner.next();

        if (karakter.equals("*")){
            System.out.println(sayi1*sayi2);
        }else if(karakter.equals("-")){
            System.out.println(sayi1-sayi2);
        }else if(karakter.equals("+")){
            System.out.println(sayi1+sayi2);
        }else if(karakter.equals("/")){
            System.out.println(sayi1/sayi2);
        }else{
            System.out.println("Invalid.");
        }
    }
}
