package kutuphaneProjesi;

import javax.naming.InvalidNameException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static kutuphaneProjesi.Ogrenci.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Ogrenci> uyeList = new ArrayList<>();
    static Ogrenci ogrenci = new Ogrenci();


    public static void anaProgram() {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\nKÜTÜPHANEMİZE HOŞ GELDİNİZ" +
                "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("1-Öğrenci işlemleri\n2-Kütüphane işlemleri");
        int anaMenuSecim = input.nextInt();

        if (anaMenuSecim == 1) {
            ogrenciMenu();
        } else if (anaMenuSecim == 2) {
            Kutuphane.kutuphaneMenu();
        } else
            System.out.println("Hatalı giriş");


    }

    static void ogrenciMenu() {
        System.out.println("******Ogrenci İşlemlerine Hoşgeldiniz******");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz = " + "\n1-Öğrenci Kaydı oluşturma \n2-kitapOduncAl " +
                "\n3-kitapIadeEt \n4-kitaplarimiListele \n5-Kütühanede Kitap ara\n6-AnaMenu  \n0-Çıkış");

        switch (input.nextInt()) {
            case 1:
                ogrenciKaydi();
                ogrenciMenu();
                break;
            case 2:
                kitapOduncAl();
                ogrenciMenu();
                break;
            case 3:
                kitapIadeEt();
                ogrenciMenu();
                break;
            case 4:
                kitaplarimiListele();
                ogrenciMenu();
                break;
            case 5:
                Kutuphane.kitapAra();
                ogrenciMenu();
                break;
            case 6:
                anaProgram();
                break;
            case 0:
                cikis();
                break;
        }

    }

    public static void cikis() {

        System.out.println("Kütüphaneden çıkış yaptınız, yine bekleriz...");
    }

    private static void ogrenciKaydi() {
        String ogrenciAd = null;

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

        int ogrenciNo = 0;
        while (true) {
            try {
                System.out.println("Öğrencinin numarasını giriniz : ");

                if (input.hasNextInt()) {
                    ogrenciNo = input.nextInt();
                    if ((ogrenciNo >= 9999 || ogrenciNo <= 1000)) {
                        System.out.println("Ogrenci No 4 haneli olmalı");
                    } else
                        break;
                } else {
                    input.next();
                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {
                System.out.println("Öğrenci no sadece rakamlardan oluşmalı.");
            }
        }
        uyeList.add(new Ogrenci(ogrenci.getOgrenciAd(), ogrenci.getOgrenciNo()));
        System.out.println("Öğrenci Kütüphaneye başarıyla kaydedildi :)");

    }

    private static void kitaplarimiListele() {

        System.out.println(Ogrenci.oduncKitaplarList);
    }

    private static void kitapIadeEt() {

        System.out.println("İade etmek istediğiniz kitabın ismini giriniz");
        String kitapAdi =input.nextLine();
        System.out.println(Ogrenci.oduncKitaplarList);
        for (Kitap each : oduncKitaplarList) {
            if (each.getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                System.out.println("Kitabi iade edebilirsiniz");
                Ogrenci.oduncKitaplarList.remove(oduncKitaplarList.indexOf(each));
                Kutuphane.mevcutKitaplar.add(each);
            } else
                System.out.println("Bu kitap kitap kütüphanemize kayıtlı değildir.");
            System.out.println("Bu kitabı kütüphanemize bağışlamak ister misiniz? \nE- Evet \nH- Hayır");
            
            if (input.next()=="E"){
                Kutuphane.kitapEkle();
                
            } else{
                System.out.println("Bir dahaki sefere...");
            }

        }

    }
    private static void kitapOduncAl() {
        System.out.println("Odunc almak istediğiniz kitap için arama yapınız");
        Kitap istenenKitap=Kutuphane.kitapAra();

       if (oduncKitaplarList.size()<3){

          Ogrenci.oduncKitaplarList.add(istenenKitap);

       }else {
           System.out.println("Kütüphanemizden maximum 3 kitap ödünç alabilirsiniz...");
       }
        oduncAlmaTarihi= LocalDate.now();

        Ogrenci.kitapİadeTarihi=oduncAlmaTarihi.plusDays(5);

        System.out.println(oduncKitaplarList.size() +" tane kitap ödünç aldınız. Bu kitapları "+
                kitapİadeTarihi + " tarihinde iade etmelisiniz.");
        Kutuphane.mevcutKitaplar.remove(istenenKitap);
        System.out.println(Ogrenci.oduncKitaplarList);
    }

}
