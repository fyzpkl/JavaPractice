package JavaReview;

public class AsallSayi {
    public static void main(String[] args) {
        int sayi = 22;
        int sayac = 0;
        for (int i = 1; i < sayi; i++) {
                if (sayi%i ==0){
                    System.out.print (i+ " ");
                    sayac++;
                }
        }
        if (sayac == 1){
            System.out.println("Asal sayi");
        }else{
            System.out.println("Asal Degil");
        }
    }
}
