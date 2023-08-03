package ZeynepA.bankaHesabı;

import java.util.ArrayList;
import java.util.Scanner;

import static ZeynepA.bankaHesabı.Main.anaMenu;
import static ZeynepA.bankaHesabı.Main.input;

public class Bank extends Account {

   static ArrayList<Account> customerAccounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(String hesapNumarasi, int bakiye) {
        super(hesapNumarasi, bakiye);
    }

    static void hesapAc(){
        System.out.println("Lütfen adınızı, soy adınızı giriniz: ");
        String customerName= new Scanner(System.in).nextLine();
        Account cstmr1 = new Account(customerName);
        customerAccounts.add(cstmr1);
        System.out.println("Yeni hesabınız oluşturulmuştur. iyi günlerde kullanın!");

    }
    static void hesapKapat(){
        System.out.println("Lütfen silmek istediğiniz hesap numarasini giriniz: ");
        String silinecekHesap= new Scanner(System.in).nextLine();
        if (customerAccounts.contains(silinecekHesap)){

            customerAccounts.remove(silinecekHesap);
            System.out.println("hesabınız silinmiştir...");
        }else System.out.println("Yanlış giriş yaptınız! Böyle bir hesap numarası sistemimizde bulunmamaktadır.");

    }

    static void bakiyeSorgula(){


    }
    static void hesapListele(){

        System.out.println("Hesap Listesi = " + customerAccounts);
    }

    static void hesapVarMi(){

        for (Account arananHesap : customerAccounts) {

            System.out.println("arananHesap.getHesapNumarasi() = " + arananHesap.getCustomerName());
        }
    }

    static void krediCekme(){
        System.out.println("Lütfen çekmek istediğiniz kredi miktarını giriniz: ");
        double krediTutari= input.nextInt();
        double faizOrani = 1.95;
        int krediSuresi = input.nextInt();

        System.out.println("Çektiğiniz krediyi "+krediSuresi+ " ay süresince geri ödeyebilirsiniz...");
        System.out.println("Toplam geri ödemeniz "+krediFaiziHesapla(krediTutari,faizOrani,krediSuresi));
    }

    static void cikis(){
        System.out.println("Bankamızdan çıkış yaptınız, iyi günler dileriz...");
    }

}
