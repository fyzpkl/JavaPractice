package JavaInterviewQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
    int number = 152;

        if (isArmstrong(number)){
            System.out.println("The number is Armstrong");
        }else{
            System.out.println("The number is not Armstrong!!");
        }
    }
    public static boolean isArmstrong(int num){

        int temp = num;
        int total = 0;

        int digit = 0;
        while (temp>0){

           digit= temp % 10;
           temp = temp /10;
           total = digit*digit*digit + total;

        }
        return num == total;
    }


}

// armstrong number is 153
//1 cube + 5 cube + 3 cube = 153 ,so it is armstrong
