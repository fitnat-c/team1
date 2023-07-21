package okul_Proje;

public class Ogrenci extends Kisi{

   private String ogrenciNo;
   private String sinif;

   public Ogrenci(){

   }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        setSinif(sinif);
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        if (ogrenciNo.matches("\\d+")&&ogrenciNo.length()==3) {
            this.ogrenciNo = ogrenciNo;
        }else
            System.out.println("Öğrenci no hatalı giriş:");

    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {

       char ch = 0;
            if (sinif.length() == 1 && Character.isUpperCase(sinif.charAt(0))) {
                ch = sinif.charAt(0);
                this.sinif = sinif;
                System.out.println("Girilen sınıf: " + ch);
            } else System.out.println("Sınıf için hatali giriş yaptınız, Lütfen Büyük harf kullanın!");
    }

    @Override
    public String toString() {

        return super.toString()+
                " ,\t ogrenciNo='" + ogrenciNo + '\'' +
                ", \t sinif='" + sinif + '\'' ;
    }
}
