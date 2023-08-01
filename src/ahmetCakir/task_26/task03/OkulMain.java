package ahmetCakir.task_26.task03;

import java.util.Scanner;
public class OkulMain {
static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Okul okul=new Okul("Clarusway",5);
        while (okul.getOgrenciler().size()< okul.getMaxOgrenciSayisi()){
            System.out.println("****Okul Kayıt İşlemine Hoşgeldiniz.******\n Lütfen öğrencimizin istenilen bilgilerini doğru bir " +
                    "şekilde dolduralım :))");
            System.out.println("Lütfen adınızı giriniz");
            input.nextLine();
            String ad=input.nextLine();
            System.out.println("soyadınızı giriniz");
            String soyAd=input.nextLine();
            System.out.println("Lütfen yaşınızı giriniz.");
            int yas=input.nextInt();
          if (yas<=15){
              Ogrenci ogrenci=new Ogrenci(ad,soyAd,yas);
              okul.getOgrenciler().add(ogrenci);
              System.out.println("Öğrencimiz "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" okulumuza kaydedilmiştir" +
                      "\n Hayırlı Olsun");
          }else {System.out.println("15 yaşın üzerinde olduğu için kayıt işlemini yapamıyoruz sıradaki öğrencimizi alalım");
          continue;
          }

        }
        System.out.println("Okulumuzdaki öğrencilerimiz");
        for (Ogrenci ogrenci:okul.getOgrenciler()) {
            System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad()+" yas :"+ogrenci.getYas());
        }


    }

}
