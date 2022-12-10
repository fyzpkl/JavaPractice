package day5;

public class DoWhileLoopIntro {

    public static void main(String[] args) {
        boolean a = false;

        for (; a; ) {
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("-------------------------------");

        while (a) {
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("-------------------------------");


        String kadi = "asd";
        do {

            System.out.println("Wooden Spoon -- do-while loop");
        } while (kadi.equals("ali"));


    }


}
