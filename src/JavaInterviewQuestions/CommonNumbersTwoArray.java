package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class CommonNumbersTwoArray {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,5,6};
        int [] arr2 ={1,2,3};



        Set <Integer> set = new HashSet<>();

        for (Integer each:arr1
             ) {
            set.add(each);
        }
        for (Integer element: arr2
             ) {
            if (set.contains(element)){
                System.out.println(element);
            }
        }
    }
}
