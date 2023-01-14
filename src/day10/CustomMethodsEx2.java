package day10;

public class CustomMethodsEx2 {
    public static void main(String[] args) {
        kareAl(5);
        topla(6,123);
    }
    public static void kareAl(int num){
        System.out.println("Sayinin Karesi = "+ (num*num));
    }
    public static void topla(int sayi1, int sayi2){

        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
}
