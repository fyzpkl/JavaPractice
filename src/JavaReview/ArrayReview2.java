package JavaReview;

public class ArrayReview2 {
    public static void main(String[] args) {
        int [] sayilar = {1,3,2,3,6,8,6}; // sayilar = size 7
        String [] isimler = {"Ali", "Veli"}; //isimler  = size 2;
        
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i]; //0 , 1 , 2
            
        }
        double ortalama = toplam / sayilar.length;
        System.out.println("ortalama = " + ortalama);
        System.out.println("toplam = " + toplam);
        int ciftSayac=0;
        int ciftToplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] %2 ==0){
                ciftToplam = ciftToplam +sayilar[i];
                ciftSayac++;
            }
        }
        System.out.println("ciftSayac = " + ciftSayac);
        System.out.println("ciftToplam = " + ciftToplam);
        
        int min = sayilar[0];
        int max = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (min>sayilar[i]){
                min = sayilar[i];
            }
            if(max<sayilar[i]){

                max = sayilar[i];
                System.out.println(max);
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
    }
}
