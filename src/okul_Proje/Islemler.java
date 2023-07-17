package okul_Proje;

import java.util.Scanner;

public class Islemler {
    static Scanner input = new Scanner(System.in);

    void anaMenu() {
        System.out.println("====================================" +
                "\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" +
                "\n\"====================================\"");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ" + "\n2- ÖĞRETMEN İŞLEMLERİ" + "\nQ- ÇIKIŞ");
        char anaMenuTercih = input.next().toUpperCase().charAt(0);
        switch (anaMenuTercih) {
            case '1':
                //kisituru="ogrenci"
                islemlerMenu();
                break;
            case '2':
                //kisituru="ogretmen"
                islemlerMenu();
                break;

            case 'Q':
                //cikis();
                break;
            default:
                System.out.println("Yanlış giriş yaptınız! Tekrar panele yönlendiriliyorsunuz.");
                anaMenu();
                break;
        }
    }

    void islemlerMenu() {

    }


}
