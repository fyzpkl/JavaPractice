package day15;

public class Kopek {
    public int yas;
    public String isim;
    public  String cins;
    public  void yemekYe(){
        System.out.println( isim + "yemek yiyor");
    }

    public void setInfo(int yas, String isim, String cins){
        this.yas = yas;
        this.isim = isim;
        this.cins = cins;

    }

    public String toString() {
        return "Kopek{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
