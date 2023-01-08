package JavaInterviewQuestions;

import java.util.*;

public class MaxDepArr {

    public int solution (String [] arr){

        Set <String > arrSet = new HashSet<>();
        Collections.addAll(arrSet,arr);

        if (arr.length==1 || arrSet.size() == arr.length){
            return 1;
        }else if( arrSet.size()==1){
            return arr.length;
        }

        Map <String, Integer> arrMap = new HashMap<>();

        for (String s : arr) {
            if (arrMap.containsKey(s)){
                arrMap.put(s,arrMap.get(s)+1);
            }else
            {
                arrMap.put(s,1);
            }

        }
        return Collections.max(arrMap.values());
    }

}
