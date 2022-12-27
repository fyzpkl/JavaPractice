package day8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
  /*      If we do not know the exact data:
        1. DataType[] variablename= new DataType[length]
        int[] nums = new int[5];


        If we know the exact data:
        2. int [] variablename = {2, 3,7, ...}*/
        "aliveli".length();
        //0123456
        
        int [] sayilar = {3,6,4,2,1,12,3,9,2,13};
        int maxNumber=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>maxNumber){
                maxNumber=sayilar[i];
            }
            
        }
        System.out.println("maxNumber = " + maxNumber);


    }
}
