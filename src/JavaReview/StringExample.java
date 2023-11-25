package JavaReview;

public class StringExample {
    public static void main(String[] args) {
        String ad  ="Ali"; // karakter =f
        boolean karakter = false;
        ad = "alias123dasda4123sd";
        for (int i = 0; i<ad.length();i++){
            char chr = ad.charAt(i);
            if(ad.indexOf(chr) == ad.lastIndexOf(chr)){
                System.out.println("Uniq: " + chr);
            }

            }
        }


    }

