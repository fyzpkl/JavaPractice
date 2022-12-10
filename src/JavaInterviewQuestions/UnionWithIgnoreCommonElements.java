package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class UnionWithIgnoreCommonElements {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,5,6,2,4};
        int [] arr2 ={1,2,3,15,24};



        Set<Integer> set = new HashSet<>();

        for (Integer each:arr1
        ) {
            set.add(each);
        }
        for (Integer element: arr2
        ) {
            if (!set.contains(element)){
                set.add(element);
            }
        }
        System.out.println(set);
    }
}
