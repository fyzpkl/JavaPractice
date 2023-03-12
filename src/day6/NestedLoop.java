package day6;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {  //0 1 2
            for (int j = 0; j < i+1; j++) { // 0..9 10
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
