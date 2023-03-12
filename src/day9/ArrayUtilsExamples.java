package day9;


import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilsExamples {
    public static void main(String[] args) {
        int [] arr= {3,2,6,5,3,1,8,7,9,12,-1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        String txt = "Hello world hello world";

        String[] arrTxt = txt.split(" ");

        System.out.println("arrTxt = " +Arrays.toString( arrTxt));
        System.out.println("txt = " + txt);
        for (int i = 0; i < arrTxt.length; i++) {
            if (arrTxt[i].equals("world")){
                System.out.println(i +". indis world");
            }
        }

        for (int i = 0; i < arrTxt.length; i++) {

        }

        for (String each: arrTxt) {
            System.out.println("each = " + each);
        }


/*
        int counter=0;
        for (String s : arrTxt) {
            if (s.equals("world")){
                counter++;
            }
        }
        System.out.println("counter = " + counter);
*/

    }


}
