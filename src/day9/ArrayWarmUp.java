package day9;

import java.util.Arrays;
import java.util.Collections;

public class ArrayWarmUp {
    public static void main(String[] args) {
        char[] arr  = "abc".toCharArray();
        System.out.println(arr[0]);
        
        String [] arr2 = "Hello world ha he hu hi".split(" ");
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        String txt = Arrays.toString(arr2);
        System.out.println("txt = " + txt);

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
