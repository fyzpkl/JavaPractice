package JavaReview;

import java.util.Scanner;

public class ArrayReview3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz.");
        int size = scanner.nextInt();

        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Array icin eleman degeri giriniz.");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if(arr[i] == 5){
                System.out.println("Aranan sayi bulundu");
            }
        }

    }
}
