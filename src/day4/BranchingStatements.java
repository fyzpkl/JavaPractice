package day4;

public class BranchingStatements {
    public static void main(String[] args) {

        String txt  = "Hello world";
        char chr = 'e';
        boolean result = false;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == chr){
                result = true;
                break;
            }
            else {
                System.out.println("aaaaaaa");
            }
        }
        if (result){
            System.out.println("Harf Buluntu");
        }else{
            System.out.println("Harf Bulunamadi");
        }

    }
}
