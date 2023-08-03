package ahmetCakir.task_26.task08._02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ahmetCakir.task_26.task08._02.Islemler.girisPaneli1;


public class MusteriEkle extends Account{
   static List<Account> musteriList=new ArrayList<>();
    public static void müsteriEkle() {
        char secim='b';
        while (secim!='H') {
            Scanner input = new Scanner(System.in);
            System.out.println(" *****Bankamıza Hoşgeldiniz******" +
                    "\nBanka Kayıt İşlemleri yapacağız.Lütfen adsoyad giriniz");
            String adSoyad = input.nextLine();
            System.out.println("Lütfen bakiyenizi giriniz");
            double bakiye = input.nextDouble();
            Account müsteri1=new Account(adSoyad,bakiye);
            musteriList.add(müsteri1);
            System.out.println("Çıkmak için 'H' ye basınız.Devam için herhangibir tuş");
            secim=input.next().charAt(0);
        }
        girisPaneli1();

    }
}

