package JavaReview;

public class ForLoop2 {
    public static void main(StringExample[] args) {
        //80 - 20 ye kadar 2 ser 2 ser geriye
        for (int i = 80; i>20; i--){
            if (i%3 ==0 && (i%5==0) ){
                System.out.println("finra");
            }else if(i%5 ==0){
                System.out.println("ra");
            }else if((i%3==0)  ) {
                System.out.println("fin");
            }else{
                System.out.println(i);
            }

        }
    }
}
// sayi 3 e bolunuyorsa fin
// 5 e bolunuyorsa ra
//hem 3 hem 5 e bolunuyorsa finra yazsin
// degilse kendisi
