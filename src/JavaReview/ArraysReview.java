package JavaReview;

public class ArraysReview {
    public static void main(String[] args) {
        String [] major = {"ali", "veli"};
        String [] arr = new String[5]; // size
        String arama = "ali";
        for (int i = 0 ; i<major.length;i++){
            if (arama.equals( major[i])){
                System.out.println("Aranan kelime bulundu");
            }
        }
    }
}
