package ZeynepA.bankaHesabı;

import java.util.Scanner;

public class Main extends Bank {


   public static Scanner input = new Scanner(System.in);

    public Main(String hesapNumarasi, int bakiye) {
        super(hesapNumarasi, bakiye);
    }

    public static void anaMenu() {
       System.out.println("********* Buddy Bank'a Hoşgeldiniz *********");

       System.out.println("Müşteri işlemleri için 1'i\nBankamıza müşteri kaydı oluşturmak için 2'yi seçiniz: ");
       int secimAnaMenu= input.nextInt();

       if(secimAnaMenu==1){

           musteriIslemleri();

       }else if (secimAnaMenu==2){

           bankaIslemleri();

       }else System.out.println("yanlış tuşlama yaptınız lütfen tekrar deneyiniz...");

   }

    static void musteriIslemleri(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Buddy Bank Müşteri İşlemlerine Hoşgeldiniz\n"+
                        "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");

        System.out.println("Değerli müşterimiz, Lütfen işleminizi seçiniz: \nBakiye Sorgulama 1 \nPara Yatırma 2 \n" +
                "Para Çekme 3 \nKredi Çekme 4 \nHesaplarımı Listele 5 \nYeni Hesap Açma 6 \n Hesap Kapatma 7 \nAna Menü 8"+
                "\nÇıkış 0");

        int musteriIslemSecim= input.nextInt();

        switch (musteriIslemSecim){

            case 1:
                bakiyeSorgula();
                musteriIslemleri();
                break;
            case 2:
                paraYatir();
                musteriIslemleri();
                break;
            case 3:
                paraCek();
                musteriIslemleri();
                break;
            case 4:
                krediCekme();
                musteriIslemleri();
                break;
            case 5:
                hesapListele();
                musteriIslemleri();
                break;
            case 6:
                hesapAc();
                musteriIslemleri();
                break;
            case 7:
                hesapKapat();
                musteriIslemleri();
                break;
            case 8:
                anaMenu();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Yanlış giriş yaptınız, lütfen tekrar deneyiniz...");
                break;
        }
    }

static void bankaIslemleri(){
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n Buddy Bank Banka İşlemlerine Hoşgeldiniz\n"+
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \nYeni Müşteri Kaydı 1 \nHesaplari Listeleme 2 \n"+
            "Hesap Kontrolü 3 \nAna Menüye 4 \nÇıkış 0");
    int bankaIslemSecim= input.nextInt();

    switch (bankaIslemSecim){

        case 1:
            hesapAc();
            bankaIslemleri();
            break;
        case 2:
            hesapListele();
            bankaIslemleri();
            break;
        case 3:
            hesapVarMi();
            bankaIslemleri();
            break;
        case 4:
            anaMenu();
            break;
        case 0:
            cikis();
            break;
        default:
            System.out.println("yanlış giriş yaptınız...");
            break;
    }
    }
}
