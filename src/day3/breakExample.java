package day3;

public class breakExample {
    public static void main(String[] args) {
        int a = 0;
        while (true){
            a++;

        if (a==4){
            continue;
        }
            System.out.println("a = " + a);

            if (a==10){
                break;
            }

        }
    }
}
