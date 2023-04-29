package day11;

public class ReturnReview {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        String name="";
        greetings("ali");
        arr = addArr(arr,6);
    }
    public static int [] addArr(int[] arr, int num){
        int [] result = new int[arr.length+1];
        int i;
        for (i = 0; i <arr.length ; i++) {
            result[i]=arr[i];
        }
        result[i]=num;
        return result;
    }
    public static void greetings(String name){
        System.out.println("Hello" + name);
    }


}
