package JavaInterviewQuestions;

import java.util.*;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int [] arr = {7,3,5,6,6,4,3,2,4,5,6,78,9,10,-5,-2};
        int firstNum = arr[0];
        int secondNum = arr[0];


        for (int ea : arr
                ) {
            if (firstNum>ea){
                secondNum = firstNum;
                firstNum =ea;
            } else if(secondNum>ea)
                secondNum=ea;

        }
        System.out.println(secondNum);

        // Solution 2 with array list

        ArrayList <Integer> arrayList = new ArrayList<>();
        for (Integer each:arr
             ) {
            arrayList.add(each);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(1));

        // Solution 3 with SortedSet
        SortedSet <Integer> sortedSet = new TreeSet <>();
        for (Integer each:arr
        ) {
            sortedSet.add(each);
        }

        System.out.println(sortedSet);
    }
}
