package JavaReview;

public class ForLoop3 {
    public static void main(StringExample[] args) {

        for (int j = 0; j <4; j++){ // j =0 / j=1
            for (int i = 0; i<6 -j ;i ++){ // i 0 1 2 3 4 / 0 1 2 3

                System.out.print("*");
            }
            System.out.println();
            for (int a =0; a<j+1; a++){
                System.out.print(" ");
            }

        }


    }
}
