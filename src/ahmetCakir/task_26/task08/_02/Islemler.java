package ahmetCakir.task_26.task08._02;


import java.util.Scanner;

public class Islemler extends Account {

 public  static void   girisPaneli1(){
     System.out.println("**** Bankamıza Hoşgeldiniz*****" +
             "\nPara yatırma işlemi için 1'e // Para çekme işlemi için 2'ye // Çıkış için Q'ya basınız" +
             "\n 1 ) PARA YATIRMA İŞLEMİ\n 2) PARA ÇEKME İŞLEMİ\n Q) ÇIKIŞ İŞLEMİ");
     Scanner input =new Scanner(System.in);
     switch (input.nextLine().toUpperCase()){
         case "1":
             System.out.println("Yatıracağınız miktarı girin");
             Account.deposit(input.nextDouble());
             System.out.println("Teşekkürler işlem menü ye yönlendiriliyorsunuz");
             girisPaneli1();
             break;
         case "2":
             System.out.println("Çekeceğiniz miktarı girin");
             Account.withdraw(input.nextDouble());
             System.out.println("Teşekkürler işlem menü ye yönlendiriliyorsunuz");
             girisPaneli1();
             break;
         case "Q":
             System.out.println("Tekrar bekleriz Güle Güle....");
             break;
         default:
             System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz..");
             girisPaneli1();
             break;
     }

 }

}
