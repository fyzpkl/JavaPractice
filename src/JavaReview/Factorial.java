package JavaReview;

public class Factorial {
    public static void main(String[] args) {
        int sayi = 4;
        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim*i;
        }
        System.out.println(carpim);
    }
}
