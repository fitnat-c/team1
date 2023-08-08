package kutuphaneProjesi;


public class Kitap {

    private String kitapAdi;
    private String yazar;
    private String yayinevi;
    private String isbn;
    private String yayinTarihi;
    private String kitapTuru;//(roman, bilim kurgu, tarih vb.gibi).

    public Kitap() {
    }



    public Kitap(String kitapAdi, String yazar, String yayinevi, String yayinTarihi, String isbn, String kitapTuru) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(String yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public String getKitapTuru() {
        return kitapTuru;
    }

    public void setKitapTuru(String kitapTuru) {
        this.kitapTuru = kitapTuru;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayinevi='" + yayinevi + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yayinTarihi='" + yayinTarihi + '\'' +
                ", kitapTuru='" + kitapTuru + '\'' +
                '}';
    }
}
