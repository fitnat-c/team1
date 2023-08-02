package ZeynepA.bankaHesabı;

import java.util.ArrayList;

import static ZeynepA.bankaHesabı.Main.anaMenu;
import static ZeynepA.bankaHesabı.Main.input;

public class Bank extends Account {

   static ArrayList<Account> customerAccounts = new ArrayList<>();

    public Bank(int hesapNumarasi, String hesapSahibi, int bakiye) {
        super(String.valueOf(hesapNumarasi), bakiye);
    }

    static void hesapAc(){
        System.out.println("Lütfen adınızı, soy adınızı giriniz: ");
        String customerName= input.nextLine();
        Customer cstmr1 = new Customer(customerName);

        anaMenu();

    }
    static void hesapKapat(){
       // hesap numarası ile

    }

    static void bakiyeSorgula(){


    }
    static void hesapListele(){

        System.out.println("customerAccounts = " + customerAccounts);
    }

    static void hesapVarMi(){

        for (Account arananHesap : customerAccounts) {

            System.out.println("arananHesap.getHesapNumarasi() = " + arananHesap.getHesapNumarasi());

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
