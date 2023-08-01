package ZeynepA.bankaHesabı;

import java.time.LocalDate;

public class Account {

    private int hesapNumarasi;

    private int bakiye;

    static void paraYatir(){

    }

    static void paraCek(){

    }
    static double mevduatFaiziHesapla(double faizOrani, int mevduatSuresi){
        int guncelBakiye= 5000;



        return guncelBakiye;
    }
    public static double krediFaiziHesapla(double krediTutari, double faizOrani, int krediSuresi) {

        double aylıkFaizOrani = faizOrani / 12;

        double aylıkOdeme = krediTutari * aylıkFaizOrani / (1 - Math.pow(1 + aylıkFaizOrani, -krediSuresi));

        double toplamGeriOdeme = aylıkOdeme * krediSuresi;

        return toplamGeriOdeme;
    }


    public Account(int hesapNumarasi, int bakiye) {
        this.hesapNumarasi = hesapNumarasi;

        this.bakiye = bakiye;
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Account{" +
                "hesapNumarasi=" + hesapNumarasi +
                ", bakiye=" + bakiye +
                '}';
    }
}
