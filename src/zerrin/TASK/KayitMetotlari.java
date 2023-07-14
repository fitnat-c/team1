package zerrin.TASK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KayitMetotlari {

    static ArrayList<Kullanici>kullaniciList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public  ArrayList<Kullanici>kayitAl() {
        System.out.println("ismini gir");
String isim=input.nextLine();
      //  LocalDateTime time=LocalDateTime.now();

Kullanici kullanici=new Kullanici(isim,LocalDateTime.now());
kullaniciList.add(kullanici);
return kullaniciList;

    }
public  void sansliKullanici(ArrayList<Kullanici>list) {
    for (Kullanici w:list) {
      if (w.kayitZamani.getSecond()<=10) {
          System.out.println("Sn. "+w.name+" " +
                  "bugun sansli gunundesin");
      }else System.out.println("sansli gununde degilsin");

    }

}
public void listele(){
    System.out.println(kullaniciList);


}
public void cikis(){
    System.out.println("gule gule");
}

}
