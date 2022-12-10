package JavaInterviewQuestions;

public class FindSpecialCharactersOfAString {
    public static void main(String[] args) {
        String str = "Hello! 123hoho@@";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

   /*         if ((str.charAt(i)>='0' && str.charAt(i)<'9')  ){

            }else if ((str.charAt(i)>='a' && str.charAt(i)<='z')){

            }else if ((str.charAt(i)>='A' && str.charAt(i)<='Z')){

            } else if (str.charAt(i) == ' ') {

            }else
                count++;*/
            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !(str.charAt(i) ==' ')){
                count++;
            }


        }
        System.out.println(count);
    }
}
