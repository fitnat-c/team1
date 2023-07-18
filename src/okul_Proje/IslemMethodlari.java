package okul_Proje;

import java.util.ArrayList;
import java.util.Scanner;


import static okul_Proje.Islemler.*;

public class IslemMethodlari {
    static Scanner input = new Scanner(System.in);

    static ArrayList<Kisi> ogretmenList = new ArrayList<>();
    static ArrayList<Kisi> ogrenciList = new ArrayList<>();

    static void ekleme() {

        System.out.println(kisiTuru + " nin ismini giriniz:");
        String adSoyad = input.nextLine();

        System.out.println(kisiTuru + " nin kimlik no giriniz:");
        String kimlikNo = input.next();


        System.out.println(kisiTuru + " nin yas giriniz: ");
        int yas = input.nextInt();

        if (kisiTuru.equals("ÖĞRENCİ")) {



            System.out.println(kisiTuru + " nin öğrenci numarasını giriniz: ");
            String ogrenciNo = input.next();

            System.out.println(kisiTuru + " nin sınıfını giriniz: ");
            String sinif = input.next();

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciList.add(ogrenci);
            System.out.println("ogrenci = " + ogrenci);
            System.out.println("ogrenciList = " + ogrenciList);

        } else if (kisiTuru.equals("ÖĞRETMEN")) {


            System.out.println(kisiTuru + " nin sicil numarasını giriniz: ");
            String sicilNo = input.next();
            System.out.println(kisiTuru + " nin bölümünü giriniz: ");
            String bolum = input.next();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenList.add(ogretmen);

            System.out.println("ogretmenList = " + ogretmenList);
        }
    }

}
