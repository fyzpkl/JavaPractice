package day2;

public class Domain {
    public static void main(String[] args) {
        String email = "Alkev.School@gmail.com";

        // domain:
        int beginningIndex = email.indexOf("@") + 1 ;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

    }
}
