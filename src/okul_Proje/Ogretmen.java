package okul_Proje;

public class Ogretmen extends Kisi {

   private String bolum;
   private String sicilNo;

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        if (bolum.matches("[a-zA-Z\\s]+")){
            this.bolum = bolum.toUpperCase();
        }else
            System.out.println("Bölüm hatalı giriş");
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        if (sicilNo.matches("\\d+")&&sicilNo.length()==5) {
            this.sicilNo = sicilNo;
        }else
            System.out.println("Sicil no hatalı giriş:");
    }

    @Override
    public String toString() {
        return super.toString()+
                " ,\t bolum='" + bolum + '\'' +
                ",\t sicilNo='" + sicilNo + '\'' ;
    }
}
