package day8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {

        int [] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=i+1;
        }
        System.out.println(arr[5]);
        System.out.println("arr = " + Arrays.toString( arr));
    }
}

/*
1. create an array that has the numbers 1 to 100*/
