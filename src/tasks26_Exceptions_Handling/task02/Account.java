package tasks26_Exceptions_Handling.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

   private  String accountNumber;
   private  double bakiye;
    static Scanner input=new Scanner(System.in);
    public Account(String accountNumber, double bakiye) {
        this.accountNumber = accountNumber;
        this.bakiye = bakiye;
    }

    public void anaMenu()  {

        System.out.println("***Ana Menu Hoş geldiniz***\n***İşlem seciniz***\n1-Bakiye Sorgula\n2-Para Ekle\n3-Para Cek\n4-Çıkış");


        switch (input.nextInt()) {
            case 1:
                System.out.println("Bakiyeniz: "+getBakiye());
                anaMenu();
                break;
            case 2:
                paraEkle();
                anaMenu();
                break;
            case 3:
                paraCek();
                anaMenu();
                break;
            case 4:
                System.out.println("Çıkış yaptınız");
                break;
            default:
                System.out.println("Hatalı giriş");
                anaMenu();
                break;
        }
    }

    void paraEkle(){
        System.out.println("Bakiyeniz: "+getBakiye());
        System.out.println("Eklemek istediğiniz miktarı giriniz:");
        double eklenen= 0;
        try {
            if (input.hasNextDouble()) {
                eklenen = input.nextDouble();
            }else
                throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş. Miktar sayı girilmeli");
            paraEkle();
        }
        bakiye+=eklenen;
        setBakiye(bakiye);
        System.out.println("Eklenen miktar: "+eklenen);
        System.out.println("Bakiyeniz son durum: "+getBakiye());
    }
    void paraCek() {
        System.out.println("Bakiyeniz: "+getBakiye());
        System.out.println("Çekmek istediğiniz miktarı giriniz:");

        double cekilen=input.nextDouble();
        if (bakiye>=cekilen) {
            if (cekilen<=5000) {
                bakiye-=cekilen;
                setBakiye(bakiye);
                System.out.println("Çekilen miktar: "+cekilen);
                System.out.println("Bakiyeniz son durum: "+getBakiye());
            }else {
                System.out.println("Günlük limiti aştınız.\t 5000 tl den fazla para cekme işlemi yapılamaz");
                paraCek();
            }
        }else {
            System.out.println("Bakiyeniz yetersiz. Çekmek istediğiniz tutar bakiyenizden fazla");
            paraCek();
        }
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
