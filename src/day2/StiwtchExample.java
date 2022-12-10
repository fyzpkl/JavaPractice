package day2;

import java.util.Scanner;

public class StiwtchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("give name");
        String gradeLevel = sc.nextLine();

        System.out.println("gice age");
        int age = sc.nextInt();
            sc.nextLine();
        System.out.println("give name");
        String gradeLevel2 = sc.nextLine();

        char glvl = gradeLevel.charAt(0);
        char grade ='B';

        switch(gradeLevel){

            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Great");
                break;
            default:
                System.out.println("Fail");
                break;

        }

    }
}
