package JavaReview;

public class Fibonachi {
    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 1;
        int toplam = 0;
        for (int i = 0; i<100;i++){
            toplam = sayi1+sayi2;
            System.out.println(toplam);
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
