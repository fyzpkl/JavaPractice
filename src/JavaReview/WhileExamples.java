package JavaReview;

public class WhileExamples {
    public static void main(StringExample[] args) {
        int sayac = 0;
        int toplam = 0;
        while (sayac<=10){

            sayac++;
            if (sayac ==5){
                continue;
            }
            toplam+=sayac;
            System.out.println(sayac);
        }
        System.out.println(toplam);
    }
}
