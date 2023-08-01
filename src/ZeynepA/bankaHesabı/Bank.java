package ZeynepA.bankaHesabı;

import java.util.ArrayList;

public class Bank extends Account {

   static ArrayList<Account> customerAccounts = new ArrayList<>();

    public Bank(int hesapNumarasi, String hesapSahibi, int bakiye) {
        super(hesapNumarasi, bakiye);
    }

    static void hesapAc(){
        //bir hesap no atamalı.
        //müşteri ismi,müşteri..

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

}
