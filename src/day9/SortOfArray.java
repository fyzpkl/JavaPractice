package day9;

import java.util.Arrays;

public class SortOfArray {
    public static void main(String[] args) {
        int [] arr= {3,2,6,5,3,1,8,7,9,12,-1};
        int [] reverseArr =new int [arr.length];
        Arrays.sort(arr);
        int counter=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
            reverseArr[counter]=arr[i];
            counter++;
        }
        System.out.println("reverseArr = " +Arrays.toString( reverseArr));
    }
}
