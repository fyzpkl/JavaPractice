package JavaInterviewQuestions;

import java.util.*;

public class FindDuplicatedNumber {
    public static void main(String[] args) {

        List <Integer> list = Arrays.asList(10,20,30,30,40,50,50);

        Set <Integer> uniqList = new HashSet();

        for (Integer each: list
             ) {
            if(!uniqList.add(each)){

                System.out.println(each + " is not uniq ");
            }
        }
        System.out.println(uniqList);
    }
}
