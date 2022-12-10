package day6;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Bir sayi giriniz");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(" even ");

            } else {
                System.out.println("odd");
            }
            String answer="";
            do {


            System.out.println("ONE MORE?");
            answer = scan.next();

            if (answer.equals("NO")) {
                break;
            }
            if (!(answer.equals("YES"))){
                System.out.println("Invalid");
            }
            }while (!(answer.equals("YES")));
            if (answer.equals("NO")){
                break;
            }
        }
    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
        if user enters yes, repeat the previous steps
        if user enters no, print nothing

        If user enteres invalid answer, repeat the previous steps*/
