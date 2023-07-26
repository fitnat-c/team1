package Serap;

import java.util.Scanner;

public class ObebOkek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        int sayi1= input.nextInt();

        System.out.println("2. sayıyı girin");
        int sayi2= input.nextInt();

        int kucukSayi = Math.min(sayi1, sayi2);
        int ebob = 1;
        for (int i = kucukSayi; i >=1 ; i--) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob=i;
                break;
            }
        }
        System.out.println(ebob);


        int ekok= (sayi1*sayi2)/ ebob;
        System.out.println("Girilen sayilarin EBOB'u= " + ebob);
        System.out.println("Girilen sayilarin EKOK'u= " + ekok);

    }
}
