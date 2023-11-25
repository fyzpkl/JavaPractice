package day16;

public class Araba {
    String marka;
    String renk;
    int fiyat;
    int yil;






    public void setInfo(String marka, String renk, int fiyat, int yil){
        this.marka = marka;
        this.renk = renk;
        this.fiyat = fiyat;
        this.yil = yil;
    }
    public void calis(){

        System.out.println(marka + " Calisti");
    }

    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", fiyat=" + fiyat +
                ", yil=" + yil +
                '}';
    }
}
