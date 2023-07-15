package zerrin.TASK;

import java.util.Scanner;

import static zerrin.TASK.KayitMetotlari.input;
import static zerrin.TASK.KayitMetotlari.kullaniciList;

public class GirisPaneli {

    public void giris() {

        KayitMetotlari obj = new KayitMetotlari();
        Scanner input = new Scanner(System.in);
        System.out.println("islemi sec" + "\n1->kayit ol\n2->sansli kisi bul" + "\n3->tum kullanicilari listele\n4->cikis");

        int secim = input.nextInt();
        switch (secim) {
            case 1:
                obj.kayitAl();
                giris();
                break;
            case 2:
                obj.sansliKullanici(kullaniciList);
                giris();
                break;
            case 3:
                obj.listele();
                giris();
                break;
            case 4:
                obj.cikis();
                break;
            default:
                System.out.println("yanlis tuslama yaptin tekrar dene");
                giris();
                break;


        }

    }


}
