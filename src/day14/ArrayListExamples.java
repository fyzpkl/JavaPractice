package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

       int [] list = {1,2,3,4,5};
        int [] arr = {3,5,7};

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(10);
        nums2.add(10);
        nums2.add(10);
        nums2.add(10);

        ArrayList<Byte> byteNums = new ArrayList<>();

        arr[0] =5;

        byte say1 = 15;

        byteNums.add(say1);

        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(14);

        System.out.println("arr = " +Arrays.toString(arr));

        System.out.println("=======================");

        System.out.println("nums = " + nums);

        System.out.println("nums = " + nums.size());

        System.out.println("nums = " + nums.get(0));

        nums.set(0,20);

        System.out.println("nums = " + nums.get(0));


        System.out.println("nums = " + nums.indexOf(11));
        System.out.println("nums = " + nums.lastIndexOf(11));
        System.out.println("nums = " + nums.contains(10));

        System.out.println("nums = " + nums.equals(nums2));


        nums2.addAll(Arrays.asList(10,16,20));


    }
}
