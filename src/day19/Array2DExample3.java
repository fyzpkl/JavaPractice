package day19;

public class Array2DExample3 {
    public static void main(String[] args) {
        String[][] seatingInfo = { {"Jamal", "Maria"}, {"Jake", "Suzy"}, {"Emma", "Luke"} };

        for (int i = 0; i < seatingInfo.length; i++) {
            for (int j = 0; j < seatingInfo[i].length; j++) {
                if (seatingInfo[i][j].equals("Suzy")){
                    System.out.println("Find");
                    System.out.println((i+1) +" -  " + (j+1));
                }
            }

        }
    }
}
