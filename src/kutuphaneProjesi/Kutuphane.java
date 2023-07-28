package kutuphaneProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static kutuphaneProjesi.Main.anaProgram;
import static kutuphaneProjesi.Main.cikis;

import static kutuphaneProjesi.Ogrenci.oduncKitaplarList;

public class Kutuphane extends Kitap {


    static Scanner input = new Scanner(System.in);


   static ArrayList<String> kitapAdi = new ArrayList<>(Arrays.asList("Kukla", "Devrim", "Zübük"));
   static ArrayList<String> IsbnList = new ArrayList<>(Arrays.asList("1111", "2222", "3333"));
   static ArrayList<String> yazar = new ArrayList<>(Arrays.asList("Ahmet Ümit", "Deniz Tokay", "Aziz Nesin"));
   static ArrayList<String> yayinevi = new ArrayList<>(Arrays.asList("Kelebek", "Can", "Okyanus"));
   static ArrayList<String> yayinTarihi = new ArrayList<>(Arrays.asList("2010", "2020", "1976"));
   static ArrayList<String> kitapTuru = new ArrayList<>(Arrays.asList("Roman", "Deneme", "Hikaye"));


    static ArrayList<Kitap> mevcutKitaplar = new ArrayList<>();

    public static void mevcutKitapListesi() {

        for (int i = 0; i < 3; i++) {
            mevcutKitaplar.add(new Kitap( kitapAdi.get(i),yazar.get(i), yayinevi.get(i), yayinTarihi.get(i),IsbnList.get(i), kitapTuru.get(i)));
        }
    }

    public static void kutuphaneMenu() {
        mevcutKitapListesi();
        String tercih = "";
        do {
            System.out.println("Asagıdaki Menuden bir tercih yapınız");
            System.out.println("**********KUTUPHANEMİMİZE  HOŞGELDİNİZ**********\n" + "\t" +
                    "1- Kitap Ekle\n" + "\t"
                    + "2- Kitap Sil\n" + "\t" + "3- Katalog Listele\n" + "\t"  +
                    "4- Kitap Ara\n" + "\t" + "5- Ana Menu\n" + "\t" + "6- Cıkıs");
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
                    kitapAra();
                    break;
                case "5":
                    anaProgram();
                    break;
                case "6":
                    cikis();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir giriş yapınız");
            }
        } while (!tercih.equals("6"));
    }

    static Kitap kitapAra() {

        System.out.println("Aradığınız kitabın ismini giriniz: ");
        String kitapAdi = input.nextLine();

        for (Kitap kitap : mevcutKitaplar) {
            if (kitap.getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                System.out.println("Aranan Kitap: " + kitapAdi+ " ismi ile kütüphanemizdedir");
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


    private static void katalogListele() {

        System.out.println("*********KUTUPHANE KİTAP LİSTESİ*********\n" );
        System.out.printf("%-15s %-15s %-15s %-15s %-9s %s\n" ,"KİTAP İSMİ","YAZAR","YAYINEVİ","YAYIN TARIHI","ISBN NO","TUR");
        for (int i = 0; i < mevcutKitaplar.size(); i++) {
            System.out.printf("%-15s %-15s %-15s %-15s %-9s %s\n", kitapAdi.get(i), yazar.get(i), yayinevi.get(i), yayinTarihi.get(i),IsbnList.get(i), kitapTuru.get(i));
        }
    }

    private static void kitapSil() {
        System.out.println("Silinecek kitabın isbn numarasını giriniz");
        String isbn = input.nextLine();

        //  try {
        //            String numara = "12345";
        //            checkIfOnlyDigits(numara);
        //
        //            numara = "12a34";
        //            checkIfOnlyDigits(numara);
        //        } catch (InvalidNumberException e) {
        //            System.out.println("Hata: " + e.getMessage());
        //        }
        //    }
        //
        //    public static void checkIfOnlyDigits(String numara) throws InvalidNumberException {
        //        for (char c : numara.toCharArray()) {
        //            if (!Character.isDigit(c)) {
        //                throw new InvalidNumberException("Geçersiz numara: " + numara);
        //            }
        //        }
        //        System.out.println("Numara geçerli: " + numara);
        //    }
        //}
        for (Kitap each : mevcutKitaplar) {

            if (each.getIsbn().equals(isbn)) {
                IsbnList.remove(isbn);
                System.out.println(isbn + " numaralı kitap silindi");
            } else System.out.println("elimizde " + isbn + " numaralı kitap bulunmamaktadır");

        }
    }
        private static void kitapEkle () {
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

            new Kitap(isim, yazari, yayinev, yayintarihi, isbn, tur);


        }


        IsbnList.add(isbn);
        System.out.println("Kitabın turunu giriniz");
        String tur = input.nextLine();
        kitapTuru.add(tur);
        mevcutKitaplar.add(new Kitap( isim,yazari, yayinev, yayintarihi,isbn,tur));



    }
    @Override
    public String toString() {
        return "Kutuphane{} " + super.toString();
    }

}