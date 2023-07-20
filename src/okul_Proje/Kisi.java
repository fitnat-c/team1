package okul_Proje;

//
public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi() {

    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        setKimlikNo(kimlikNo);
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {

        if (adSoyad.matches("[a-zA-Z\\s]+")){
            this.adSoyad = adSoyad.toUpperCase();
        }else
            System.out.println("isim hatalı giriş");

    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {

        if (kimlikNo.matches("\\d+")&&kimlikNo.length()==11) {
            this.kimlikNo = kimlikNo;
        }else
            System.out.println("Kimlik no hatalı giriş:");
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

        if (7<=yas&& yas<=18) {
            this.yas = yas;
        }else
            System.out.println("yas hatalı giris");

    }

    @Override
    public String toString() {
        return "adSoyad='" + adSoyad + '\'' +
                ",\t kimlikNo='" + kimlikNo + '\'' +
                ",\t yas= " + yas;
    }
}
