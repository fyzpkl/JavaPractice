package day7;

public class FreqOfString {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result="";
        int counter;
        for (int i = 0; i < str.length(); i++) {
            counter=1;
            char ch = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                char each=str.charAt(j);
                if (ch==each){
                    counter++;
                }
            }
            if (result.contains((""+ch))) {
                continue;
            }
            result+=ch+""+counter;
        }

        System.out.println(result);


    }
}
