package JavaReview;

import java.util.Scanner;

public class ForLoop {
    public static void main(StringExample[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int min = scanner.nextInt();

        int toplam = 0;
        for(int i = min;i<=max;i++){ // 1-10

           toplam = toplam +i;  // toplam +=i

        }
        System.out.println("toplam = " + toplam);


    }
}
