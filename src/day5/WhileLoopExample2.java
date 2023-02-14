package day5;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        int key = 5;

        do {
            System.out.println("Hello World");
        }while (key==3);

       String text =  "JavaJavaJava";
        int counter=0;
        for (int i = 0; i < text.length()-3; i++) {
            if (text.substring(i,i+4).equals("Java")){
                counter ++;
            }
        }
        System.out.println("counter = " + counter);
    }
}
