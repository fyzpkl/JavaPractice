package day11;



public class CustomMethodReturn {
    public static void main(String[] args) {
        // sozlu yazili performans
           // 1   1      1
        double sonuc = ortalama(75 , (int) ortalama(100,85));

        System.out.println("sonuc = " + sonuc);
        sonuc = ortalama(55,25.0);



    }
    
    public static float ortalama(int sayi1, int sayi2){
        float result =(sayi1+sayi2)/2;
        System.out.println("result = " + result);
        return result;
    }
    public static double ortalama(double sayi1, double sayi2){
        double result =(sayi1+sayi2)/2;
        System.out.println("result = " + result);
        return result;
    }


}
