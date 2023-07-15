package Task20;

import java.util.Scanner;

public class T02_Musteri {

    String name;
    T02_ElektrikHesabi hesap=new T02_ElektrikHesabi();// create obj from T02_ElektrikHesabi()


    void getUser(){
        Scanner input=new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        name=input.nextLine();
        System.out.print("Kaç aylık fatura hesaplamak istiyorsun: ");
        int ay= input.nextInt();

        if (ay<2) {
            System.out.println("en az 2 aylık hesaplanabilir! Tekrar giriş yap: ");
            getUser();
        }else {
            int i = 0;
            do {
                System.out.print((i+1)+". ay tüketilen enerji miktarı giriniz: ");
                hesap.tuketimEkle(input.nextInt());
                i++;
            } while (i < ay);
        }
    }


}
