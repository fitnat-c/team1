package MustafaAba.UcusProjesi;

public class secim {
    static double toplamUcret;

    public static double sehirSec(char sehir) {

        switch (sehir) {
            case 'B':
                toplamUcret = ucretHesapla(500, 0.1);
                break;
            case 'C':
                toplamUcret = ucretHesapla(700, 0.1);
                break;
            case 'D':
                toplamUcret = ucretHesapla(900, 0.1);
                break;
            default:
                System.out.println("Yanlış giriş yaptınız. Tekrar deneyin");
                sehirSec(sehir);
        }
        return toplamUcret;

    }
    public static double yasKontrol(int yas){
        if (yas>=0) {

            if (yas<=12) {
                toplamUcret=ucretHesapla(toplamUcret,0.5);
            } else if (yas<=24) {
                toplamUcret=ucretHesapla(toplamUcret,0.9);
            } else if (yas>=65) {
                toplamUcret=ucretHesapla(toplamUcret,0.7);
            }
        }else {
            System.out.println("Yas negatif olamaz! tekar deneyin");
            yasKontrol(yas);
        }
        return toplamUcret;
    }

    public static double gidisDonus(char ch){
        if (ch=='E') {
            toplamUcret=ucretHesapla(toplamUcret,0.8)*2;
        }
        return toplamUcret;
    }
    public static double ucretHesapla(double x,double y) {
        return x*y;
    }
    public static void ucretYaz(double toplamUcret){
        System.out.println("toplam ucret="+ toplamUcret);
    }

}
