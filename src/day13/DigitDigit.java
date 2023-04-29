package day13;

public class DigitDigit {
    public static void main(String[] args) {
        int num = 9119;
        System.out.println( squareDigits(num));

    }

    public static Integer squareDigits(int num) {
        String box = "";

        while (num > 0) {
            int digit = num % 10;
            int square = digit * digit;
            box = square + box;
            num /= 10;
        }

        return  Integer.parseInt(box);
    }
}
