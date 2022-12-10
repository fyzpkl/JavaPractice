package day5;

public class WhileLoopIntro {

    public static void main(String[] args) {

        if(true){
            System.out.println("Wooden Spoon"); // 1 time
        }


        System.out.println("-----------------------------------------");
        int i =0;
        while(i<5){ // repeated if
            System.out.println("Wooden Spoon"); //
            if(i==3){
                break;
            }
            i++;
        }


    }

}
