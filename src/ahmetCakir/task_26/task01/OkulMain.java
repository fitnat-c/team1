package ahmetCakir.task_26.task01;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul=new Okul("Fatih ilköğretim",15);
        while (okul.getOgrenciler().size()<okul.getMaxOgrenciSayisi()){
            Ogrenci yeniOgrenciler=yeniOgrenciOlustur();
            if (yeniOgrenciler.getYas()<=15&&yeniOgrenciler.getYas()>=7){
              okul.getOgrenciler().add(yeniOgrenciler);
            }else System.out.println("Öğrenci yaşı okul çağı için uygun olmadığı için eklenemiyor: " + yeniOgrenciler.getAd()+" "+yeniOgrenciler.getSoyAd()+"-"+yeniOgrenciler.getYas());
        }
        System.out.println("Okuldaki öğrenciler : ");
        for (Ogrenci ogrenci :okul.getOgrenciler()) {
            System.out.println(ogrenci.getAd()+ " "+ogrenci.getSoyAd()+"-"+ogrenci.getYas()+" yaş");
        }
    }

    private static Ogrenci yeniOgrenciOlustur() {
        String[] adlar={"Ali","Ayşe","Ahmet","Mehmet","Fatma","İsmail","Feyza","Gülhan","Halime"};
        String[] soyAdlar={"çakır","aydın","yılmaz","kaya","demir","çelik","şahin","taş"};
        String ad=adlar[(int) (Math.random()*adlar.length)];
        String soyad=soyAdlar[(int) (Math.random()* soyAdlar.length)];
        int yas=(int) (Math.random()*20);
        return new Ogrenci(ad,soyad,yas);

    }
}