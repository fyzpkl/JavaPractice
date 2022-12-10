package day4;

public class FindFibonachiSeq {
    public static void main(String[] args) {
        int first =1;
        int second =1;
        int result = 1;
        System.out.println(result);
        for(int i = 1; result<1000; i ++ ){
            System.out.println(result );
            result = first + second;
            first = second;
            second = result;
        }
    }
}
