package day12;

public class KataBeast {
    public static boolean feast(String beast, String dish) {


        if ((beast.charAt(0)) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {

            return true;

        }
        return false;

    }

    public static void main(String[] args) {


            //Add your code here
    int num =5;
            String a = "";

            if(num == 0){
                System.out.println("non");
            }

            for(int i = 1; i<=num; i++){
                a += i + " sheep...";
            }
        System.out.println(a);
        }
    }
