package okul_Proje;

import java.util.ArrayList;
import java.util.Scanner;


import static okul_Proje.Islemler.*;

public class IslemMethodlari {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Kisi> ogretmenList = new ArrayList<>();
    static ArrayList<Kisi> ogrenciList = new ArrayList<>();

    static void ekleme() {
        System.out.println("***Ekleme Sayfası***");

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
            input.nextLine();// dummy: next() ardından input.nextLine() dummy ile önceki satırdaki newline(enter) karakteri temizlenmiştir.


            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciList.add(ogrenci);

            System.out.println("ogrenci = " + ogrenci);
            System.out.println("Kayıt başarıyla yapıldı.");
            System.out.println("ogrenciList = " + ogrenciList);

        } else {
            System.out.println(kisiTuru + " nin sicil numarasını giriniz: ");
            String sicilNo = input.next();

            System.out.println(kisiTuru + " nin bölümünü giriniz: ");
            String bolum = input.next();
            input.nextLine();// dummy: next() ardından input.nextLine() dummy ile önceki satırdaki newline(enter) karakteri temizlenmiştir.

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println("ogretmen = " + ogretmen);
            System.out.println("Kayıt başarıyla yapıldı.");
            System.out.println("ogretmenList = " + ogretmenList);
        }
    }


    static void arama() {
        System.out.println("***Arama Sayfası***");

        System.out.println("Aradığınız " + kisiTuru + " nin kimlik no giriniz:");
        String arananKimlikNo = input.next();
        input.nextLine();// dummy: next() ardından input.nextLine() dummy ile önceki satırdaki newline(enter) karakteri temizlenmiştir.
        boolean flag = false;
        int index = 0;

        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (Kisi w : ogrenciList) {
                if (arananKimlikNo.equals(w.getKimlikNo())) {
                    index = ogrenciList.indexOf(w);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Aranan öğrenci: " + arananKimlikNo + " kimlik numarasıyla " + ogrenciList.get(index).getAdSoyad() + " ismi ile kayıtlıdır.");
            } else
                System.out.println("Aranan öğrenci: " + arananKimlikNo + " kimlik numarasıyla kayıtlı öğrenci yoktur.");

        } else {
            for (Kisi w : ogretmenList) {
                if (arananKimlikNo.equals(w.getKimlikNo())) {
                    index = ogretmenList.indexOf(w);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Aranan öğretmen: " + arananKimlikNo + " kimlik numarasıyla " + ogretmenList.get(index).getAdSoyad() + " ismi ile kayıtlıdır.");
            } else
                System.out.println("Aranan öğretmen: " + arananKimlikNo + " kimlik numarasıyla kayıtlı öğretmen yoktur.");
        }

    }

    static void silme() {
        System.out.println("***Silme Sayfası***");

        boolean flag = false;
        int index = 0;

        if (kisiTuru.equals("ÖĞRENCİ")) {
            if (ogrenciList.isEmpty()) {
                System.out.println("Öğrenci List boş");
            } else {
                System.out.println("Silmek istediğiniz " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();
                input.nextLine();// dummy: next() ardından input.nextLine() dummy ile önceki satırdaki newline(enter) karakteri temizlenmiştir.

                for (Kisi w : ogrenciList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogrenciList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(ogrenciList.get(index).getAdSoyad() + "isimli öğrenci: " + arananKimlikNo + " kimlik numarasıyla silinmiştir.");
                    ogrenciList.remove(ogrenciList.get(index));
                } else
                    System.out.println(arananKimlikNo + " kimlik numarasıyla kayıtlı öğrenci yoktur.");

            }
        } else {
            if (ogretmenList.isEmpty()) {
                System.out.println("Öğretmen List boş");
            } else {
                System.out.println("Silmek istediğiniz " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();
                input.nextLine();// dummy: next() ardından input.nextLine() dummy ile önceki satırdaki newline(enter) karakteri temizlenmiştir.
                for (Kisi w : ogretmenList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogretmenList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(ogretmenList.get(index).getAdSoyad() + "isimli öğretmen: " + arananKimlikNo + " kimlik numarasıyla silinmiştir.");
                    ogretmenList.remove(ogretmenList.get(index));
                } else
                    System.out.println(arananKimlikNo + " kimlik numarasıyla kayıtlı öğretmen yoktur.");
            }
        }
    }

    static void listele() {
        System.out.println("***Listeleme Sayfası***");

        if (kisiTuru.equals("ÖĞRENCİ")) {
            if (!ogrenciList.isEmpty()) {
                System.out.println("***Öğrenciler***");
                for (Kisi w:ogrenciList) {
                    System.out.println(w);
                }
            }else
                System.out.println("Sistemde öğrenci bulunmamaktadır.");

        }else if (kisiTuru.equals("ÖĞRETMEN")) {
            if (!ogretmenList.isEmpty()) {
                System.out.println("***Öğretmenler***");
                for (Kisi w:ogretmenList) {
                    System.out.println(w);
                }
            }else
                System.out.println("Sistemde öğretmen bulunmamaktadır.");
        }
    }

    static void cikis() {
        System.out.println("Çıkış yapıldı");
    }
}


