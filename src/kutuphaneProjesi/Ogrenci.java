package kutuphaneProjesi;

import java.time.LocalDate;
import java.util.ArrayList;

public class  Ogrenci extends Kitap {

    /*
    * Özellikler: ogrenciAdi, ogrenciNo, oduncAlmaTarihi,kitapIadeTarihi,oduncKitaplarList
    * */

    private String ogrenciAd;
    private int ogrenciNo;


    static LocalDate oduncAlmaTarihi=LocalDate.now();

    static LocalDate kitapIadeTarihi;



    public static ArrayList<Kitap> oduncKitaplarList=new ArrayList<>();


    public Ogrenci() {

    }

    public Ogrenci(String ogrenciAd, int ogrenciNo) {
        super();
        this.ogrenciAd = ogrenciAd;
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(String ogrenciAd, int ogrenciNo, ArrayList<Kitap> oduncKitaplarList) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciNo = ogrenciNo;
        Ogrenci.oduncKitaplarList =oduncKitaplarList;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {

        return super.toString()+"Ogrenci{" +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", ogrenciNo=" + ogrenciNo +
                "} " +oduncKitaplarList;
    }
}
