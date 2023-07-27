package kutuphaneProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static kutuphaneProjesi.Ogrenci.oduncKitaplarList;

public class Kutuphane extends Kitap {

    static Scanner input = new Scanner(System.in);


    static ArrayList<String> kitapAdi = new ArrayList<>();
    static ArrayList<String> IsbnList = new ArrayList<>();
    static ArrayList<String> yazar = new ArrayList<>();
    static ArrayList<String> yayinevi = new ArrayList<>();
    static ArrayList<String> yayinTarihi = new ArrayList<>();
    static ArrayList<String> kitapTuru = new ArrayList<>();


    static ArrayList<Kitap> mevcutKitaplar = new ArrayList<>();



    public static void mevcutKitapListesi() {

        ArrayList<String> IsbnList = new ArrayList<>(Arrays.asList("9876543211234", "9876543211347", "9876543211456"));
        ArrayList<String> kitapAdi = new ArrayList<>(Arrays.asList("Kukla", "Devrim", "Zübük"));
        ArrayList<String> yazar = new ArrayList<>(Arrays.asList("Ahmet Ümit", "Deniz Tokay", "Aziz Nesin"));
        ArrayList<String> yayinevi = new ArrayList<>(Arrays.asList("Kelebek", "Can", "Okyanus"));
        ArrayList<String> yayinTarihi = new ArrayList<>(Arrays.asList("2010", "2020", "1976"));
        ArrayList<String> kitapTuru = new ArrayList<>(Arrays.asList("Roman", "Deneme", "Hikaye"));

        System.out.println("*********KUTUPHANE MENU*********\n" + "ISBN NO       KİTAP İSMİ  YAZAR          YAYINEVİ    YILI  TUR");
        for (int i = 0; i < kitapTuru.size(); i++) {
            System.out.printf("%13s %-10s  %-15s %-9s  %-5s %s\n", IsbnList.get(i), kitapAdi.get(i), yazar.get(i), yayinevi.get(i), yayinTarihi.get(i), kitapTuru.get(i));
        }
    }

    public static void kutuphaneMenu() {
        String tercih = "";
        do {
            System.out.println("Asagıdaki Menuden bir tercih yapınız");
            System.out.println("**********KUTUPHANEMİMİZE  HOŞGELDİNİZ**********\n" + "\t" +
                    "1- Kitap Ekle\n" + "\t"
                    + "2- Kitap Sil\n" + "\t" + "3- Katalog Listele\n" + "\t" + "4- Kitap Var Mi\n" + "\t" +
                    "5- Kitap Ara\n" + "\t" + "6- Ana Menu\n" + "\t" + "7- Cıkıs");
            tercih = input.nextLine();
            switch (tercih) {
                case "1":
                    kitapEkle();
                    break;
                case "2":
                    kitapSil();
                    break;
                case "3":
                    katalogListele();
                    break;
                case "4":
                    kitapVarMi();
                    break;
                case "5":
                    kitapAra();
                    break;
                case "6":
                    kutuphaneMenu();
                    break;
                case "7":
                    Cikis();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir giriş yapınız");
            }
        } while (!tercih.equals("7"));
    }

    private static void Cikis() {
    }

    private static Kitap kitapAra() {

        System.out.println("Aradığınız kitabın ismini giriniz: ");
        String kitapAdi = input.nextLine();

        for (Kitap kitap : mevcutKitaplar) {

            if (kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)) {

                return kitap;
            } else
                for (Kitap each : oduncKitaplarList) {
                    if (each.getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        System.out.println("Odunc verilen kitap su tarihte odunc alınabilir");
                    } else
                        System.out.println("Aranan kitap kütüphanemize kayıtlı değildir.");
                }
        }
        return null;
    }


    private static void kitapVarMi() {

        Kitap arananKitap = Kutuphane.kitapAra();

        if (arananKitap != null) {
            System.out.println("Aranan Kitap: " + arananKitap);
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    private static void katalogListele() {
    }

    private static void kitapSil() {
        System.out.println("Silinecek kitabın isbn numarasını giriniz");
        int isbn = input.nextInt();
        IsbnList.remove(isbn);
    }

    private static void kitapEkle() {
        System.out.println("Kitabın ismini giriniz");
        String isim = input.nextLine();
        kitapAdi.add(isim);
        System.out.println("Kitabın yazarini giriniz");
        String yazari = input.nextLine();
        yazar.add(yazari);
        System.out.println("Kitabın yayinevini giriniz");
        String yayinev = input.nextLine();
        yayinevi.add(yayinev);
        System.out.println("Kitabın yayin tarihini giriniz");
        String yayintarihi = input.nextLine();
        yayinTarihi.add(yayintarihi);
        System.out.println("Kitabın isbn numarasını giriniz");
        String isbn = input.nextLine();
        IsbnList.add(isbn);
        System.out.println("Kitabın turunu giriniz");
        String tur = input.nextLine();
        kitapTuru.add(tur);

        new Kitap(isim, yazari, yayinev, yayintarihi ,isbn, tur);


    }
}