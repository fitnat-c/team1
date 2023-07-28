package kutuphaneProjesi;

import java.util.ArrayList;

public class  Ogrenci extends Kitap {

    private String ogrenciAd;
    private int ogrenciNo;

    static ArrayList<Kitap> oduncKitaplarList=new ArrayList<>();

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
        this.oduncKitaplarList=oduncKitaplarList;
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
