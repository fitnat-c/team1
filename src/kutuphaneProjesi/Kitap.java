package kutuphaneProjesi;

import java.time.LocalDate;

public class Kitap {
    private String kitapAdi;
    private String yazar;
    private String yayinevi;
    private int isbn;
    private int tempIsbn=1000;// sadece rakamlardan oluşmalı
    private LocalDate yayinTarihi;
    private String kitapTuru;//(roman, bilim kurgu, tarih vb. gibi).

    public Kitap() {
    }

    public Kitap(String kitapAdi, String yazar, String yayinevi, LocalDate yayinTarihi, String kitapTuru) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        tempIsbn++;
        this.isbn = tempIsbn;
        this.yayinTarihi = yayinTarihi;
        this.kitapTuru = kitapTuru;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getTempIsbn() {
        return tempIsbn;
    }

    public void setTempIsbn(int tempIsbn) {
        this.tempIsbn = tempIsbn;
    }

    public LocalDate getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(LocalDate yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public String getKitapTuru() {
        return kitapTuru;
    }

    public void setKitapTuru(String kitapTuru) {
        this.kitapTuru = kitapTuru;
    }
}
