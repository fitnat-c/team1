package tasks26_Exceptions_Handling.task01;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;

    static ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public static ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public static void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        Okul.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                '}';
    }
}