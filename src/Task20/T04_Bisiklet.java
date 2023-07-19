package Task20;

import java.util.Scanner;

public class T04_Bisiklet {
    int hiz=10;
    int vites=1;

    Scanner input = new Scanner(System.in);

    void hizDegistir() {
        System.out.print("Yeni hız giriniz: ");
        this.hiz=input.nextInt();
    }

    void vitesArtir() {
        vites++;
    }

    void vitesAzalt() {
        vites--;
    }

    void durumGoster() {
        System.out.println("hiz = " + hiz);
        System.out.println("vites = " + vites);
    }
    void dur(){
        System.out.println("Bisiklet durdu.");
    }

    void islemYap() {
        System.out.println("***İşlem Menusu****");
        System.out.println("1-> Durum goster\n2->vites artır\n3->vites azalt" +
                "\n4->Hiz degistir\n5->Stop");


        int secim = input.nextInt();
        switch (secim) {
            case 1:
                durumGoster();
                islemYap();
                break;
            case 2:
                vitesArtir();
                islemYap();
                break;
            case 3:
                vitesAzalt();
                islemYap();
                break;
            case 4:
                hizDegistir();
                islemYap();
                break;
            case 5:
                dur();
                break;
            default:
                System.out.println("Hatalı giriş. Tekrar dene");
                islemYap();
                break;

        }
    }


}