package JavaInterviewQuestions;

public class PalindromeWordsInSentence {
    public static void main(String[] args) {
        String text = "Hello my name is asdsa how are you olo";
        String [] str = text.split(" ");
    try{
        for (String each : str) {
            if (isPalindrome(each)){
                System.out.println(each + " is palindrome");
            }
        }
    }catch (Exception e){
        System.out.println("Wrong Data is given");
    }

    }

    public static boolean isPalindrome(String word){
        int i =0;
        int j =word.length()-1;
        while (j>i){
            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
