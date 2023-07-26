package kutuphaneProjesi;

import java.util.ArrayList;
import java.util.Arrays;

import static kutuphaneProjesi.Main.anaProgram;

public class Runner {
    public static void main(String[] args) {

        anaProgram();
        ArrayList<String> kitapAdi=new ArrayList<>(Arrays.asList("Kukla","Devrim","Zübük"));
        ArrayList<String>yazar=new ArrayList<>(Arrays.asList("Ahmet Ümit","Deniz Tokay","Aziz Nesin"));
        ArrayList<String>yayinEvi=new ArrayList<>(Arrays.asList("Kelebek","Can","Okyanus"));
        ArrayList<String>yayinTarihi=new ArrayList<>(Arrays.asList("2010","2020","1976"));
        ArrayList<String>kitapTuru=new ArrayList<>(Arrays.asList("Roman","Deneme","Hikaye"));

        System.out.println("*********KUTUPHANE MENU*********\n"+" KİTAP İSMİ  YAZAR          YAYINEVİ    YILI  TUR");
        for (int i = 0; i <kitapTuru.size() ; i++) {
            System.out.printf("%-10s  %-15s %-9s  %-5s %s\n\t",kitapAdi.get(i),yazar.get(i),yayinEvi.get(i),yayinTarihi.get(i),kitapTuru.get(i));
        }

    }
}
