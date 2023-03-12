package day12;

import java.util.Arrays;

public class ArrayCustomMethods {
    public static void main(String[] args) {
        int []  nums = {1, 2, 3, 4};
        int []  result = addInt(nums, 5);
        System.out.println(Arrays.toString(result));
    }

    public static int [] addInt(int [] arr, int num){
        int [] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=num;

        return newArr;
    }
}
