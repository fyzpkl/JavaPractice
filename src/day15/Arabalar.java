package day15;

public class Arabalar {
    String renk;
    String marka;
    int yil;
    float motor;

    public void setInfo(String markaAd, float motorGucu, String arabaRenk, int arabaYil){

        renk=arabaRenk;
        marka=markaAd;
        yil=arabaYil;
        motor = motorGucu;

    }


    public void hizlan(){
        System.out.println(marka +" hizlandi");
    }
    public void fren(){
        System.out.println(marka +" fren yapti");
    }
    public void don(){
        System.out.println(marka +" döndü");
    }

    public String toString() {
        return "Arabalar{" +
                "renk='" + renk + '\'' +
                ", marka='" + marka + '\'' +
                ", yil=" + yil +
                ", motor=" + motor +
                '}';
    }

}
