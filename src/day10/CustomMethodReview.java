package day10;

import java.util.Scanner;

public class CustomMethodReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        int age = 10;
        //displayMessage(name, age);
        displayMessage1();
        topla(10,25);
        araTopla();
    }
    public static void araTopla(){
        int toplam=0;
        for (int i = 0; i < 11; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
    }


    public static void topla(int num1, int num2){
        int num3 =20;
        System.out.println("Sum = " + (num1+num2+num3));
    }
    public static void displayMessage(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("Your age is "+ age);
    }
    public static void displayMessage1(){
        System.out.println("I love Java");
    }

}
