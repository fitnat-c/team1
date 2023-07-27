package kutuphaneProjesi;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static  ArrayList<Ogrenci> uyeList = new ArrayList<>();
    static  Ogrenci ogrenci = new Ogrenci();


    static void anaProgram(){

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+"\nKÜTÜPHANEMİZE HOŞ GELDİNİZ"+
                "\n"+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz = "+"\n1-Öğrenci Kaydı oluşturma \n2-Kitap ekleme "+
                "\n3-Kitap silme \n4-Kitap listeleme \n5-Kitap arama \n0-Çıkış");

        int secim = input.nextInt();

        switch (secim) {

            case 1:
                ogrenciKaydi();
                anaProgram();
                break;
            case 2:
                kitapEkleme();
                anaProgram();
                break;
            case 3:
                kitapSilme();
                anaProgram();
                break;
            case 4:
                kitapListeleme();
                anaProgram();
                break;
            case 5:
                kitapArama();
                anaProgram();
                break;
            case 0:
                cikis();
                anaProgram();
        }

    }

    private static void cikis() {

        System.out.println("Kütüphaneden çıkış yaptınız, yine bekleriz...");
    }

    private static void ogrenciKaydi() {
        String ogrenciAd= null;
        while (true) {
            try {
                System.out.print("Kaydı yapılacak öğrencinin adını giriniz: ");
                ogrenciAd = input.nextLine();
                if (!ogrenciAd.matches("[A-Za-z\\s]+")) throw new InvalidNameException();
                else break;
            } catch (InvalidNameException e) {
                System.out.println("İsim sadece harflerden olmalı.");
            }
        }

        System.out.println("Öğrencinin numarasını giriniz : ");

        int ogrenciNo= input.nextInt();

        uyeList.add(new Ogrenci(ogrenci.getOgrenciAd(), ogrenci.getOgrenciNo()));
        System.out.println("Öğrenci Kütüphaneye başarıyla kaydedildi :)");

    }

    private static void kitapArama() {

        System.out.println("Aradığınız kitabın türünü ve kitap numarasını giriniz");

        String kitapTuru= input.nextLine();

        //kitap türü ve kitap numarası ile arama yapılacak

    }

    private static void kitapListeleme() {

        //kütüphaneye eklenen kitaplar Arraylist methodları ile yazdırılacak


    }

    private static void kitapSilme() {

        //kitap türü ve kitap numarası ile kitap silinecek.(kitap silme gerekçesi
        // de ekleyebiliriz, kayıp, kullanılmayacak durumda vs. gibi)


    }

    private static void kitapEkleme() {

        //eklenecek kitabın, türü ve adı alınmalı, kitaba yeni bir kütüphane numarası atanmalı, yazar adı,
        // yayın tarihi ve yayınevi alınacak,


    }


}
