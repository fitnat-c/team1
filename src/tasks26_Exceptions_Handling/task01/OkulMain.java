package tasks26_Exceptions_Handling.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

        Okul okul = new Okul("Clarusway", 200);

        ogrenciEkle(okul);

    }

    private static void ogrenciEkle(Okul okul) {
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci Ekle Sayfası");

        while (okul.getMaxOgrenciSayisi()>Okul.ogrenciler.size()) {

            System.out.print("Eklemek istediğiniz öğrencinin adı:");
            String ad = input.nextLine();

            System.out.print("Eklemek istediğiniz öğrencinin soyadı:");

            String soyad = input.next();

            System.out.print("Eklemek istediğiniz öğrencinin yaşı:");
            int yas = 0;
            try {
                if (input.hasNextInt()) {
                    yas = input.nextInt();
                    if (yas <= 15) {
                        Okul.ogrenciler.add(new Ogrenci(ad, soyad, yas));
                    } else {
                        System.out.println("15 yaşından büyük öğrenci kaydı yapılamaz. Başka bir öğrenci girin.");
                    }
                }else
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Yas Hatalı Giriş: Yas rakamlardan oluşmalı");
                input.nextLine();//dummmy
            }
            input.nextLine();//dummmy
        }
            System.out.println("Okul max seviyede olduğundan öğrenci eklenemez.");
        System.out.println("Ogrenciler = " + Okul.getOgrenciler());

    }


}


