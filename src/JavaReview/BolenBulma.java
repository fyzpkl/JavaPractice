package JavaReview;

public class BolenBulma {
    public static void main(String[] args) {
        int sayi = 28;
        // toplam eger toplam > < =
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i ==0){
                toplam = toplam + i;
            }
        }
        if (toplam > sayi){
            System.out.println("D");
        }else if(toplam < sayi){
            System.out.println("A");
        }else{
            System.out.println("P");
        }
    }
}
