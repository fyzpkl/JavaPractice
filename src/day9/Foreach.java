package day9;

public class Foreach {
    public static void main(String[] args) {
/*        2. Write a program that can count the even and odd number from an array of integers

        Note: MUST use for each loop*/
        int countOdd=0;
        int countEven=0;
        int [] arr ={3,2,6,5,3,1,8,7,9,12,-1};
        for (int each : arr) {
            if (each%2==0){
                countEven++;
                continue;
            }
            countOdd++;
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);



    }
}
