package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicatedElement {
    public static void main(String[] args) {

        int [] arr = {1,3,5,6,6,4,3,2,4,5,6,78,9,10,-5,-2};

        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        ArrayList <Integer> reverseList = new ArrayList<Integer>();
        ArrayList <Integer> uniqList = new ArrayList<Integer>();

        // add array element into an arrayList
        for (int each:arr
             ) {
            arrayList.add(each);
        }
        System.out.println(arrayList);

        //check duplicated element
        for (Integer element: arrayList
             ) {
            if (arrayList.indexOf(element) != arrayList.lastIndexOf(element)){

                uniqList.add(element);
            }
        }
        System.out.println(uniqList);

        //sort arraylist and make an reverse list
        Collections.sort(arrayList);
        reverseList.addAll(arrayList) ;
        System.out.println(reverseList.get(1));

    }
}
