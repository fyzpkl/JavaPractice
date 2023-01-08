package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleArrayList {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("a");
        liste.add("b");
        liste.add("c");
        System.out.println(shuffle(liste));
    }
    public static List<String> shuffle(List<String> input){

        List<String> returnList = new ArrayList<>();
        Random random = new Random();

        int index = 0;
        for (String s : input) {
            while(true){
                index = random.nextInt(3);
                System.out.println(index);
                if (returnList.get(index).isEmpty()){
                    returnList.add(index,s);
                    break;
                }
            }


        }
        return returnList;
/*        Collections.shuffle(input);
        return  input;*/
    }
}
