package day1;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello , World!");

        byte inches = 25;

        String greeting = "Hello World";

        String str = new String("Hello World");

        System.out.println("greeting = " + greeting);

        System.out.println("inches = " + inches);


        if (inches>4){

            System.out.println("It is okay");

        }else if(inches<0) {
            System.out.println("not okay");
        }else {

            System.out.println("hi");
        }

        System.out.println("=====================================");
        if (inches>4){
            System.out.println("1.if");
        }
        if (inches>10){
            System.out.println("2.if");
        }
        if (inches> 20){
            System.out.println("3.if");

        }


        boolean isTrue = greeting.equals(str);
        System.out.println("isTrue = " + isTrue);
        System.out.println("================================");
        if (greeting == str){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        String str2 = "Hello World";
        System.out.println("===================================");
        if (greeting == str2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        System.out.println(greeting.charAt(greeting.length()));
    }
}
