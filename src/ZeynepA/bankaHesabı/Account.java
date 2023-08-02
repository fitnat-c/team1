package ZeynepA.bankaHesabı;

import java.time.LocalDate;

public class Account extends Customer{

    private String hesapNumarasi;

    private int bakiye;

    public Account(String customerName) {
        super(customerName);
    }

    public Account(String hesapNumarasi, int bakiye) {
        super();

    }

    static void paraYatir(){

    }

    static void paraCek(){

    }
    static double mevduatFaiziHesapla(double faizOrani, int mevduatSuresi){

        int guncelBakiye= 5000;



        return guncelBakiye;
    }
    public static double krediFaiziHesapla(double krediTutari, double faizOrani, int krediSuresi) {

        double aylıkFaizOrani = faizOrani / 12;

        double aylıkOdeme = krediTutari * aylıkFaizOrani / (1 - Math.pow(1 + aylıkFaizOrani, -krediSuresi));

        return   aylıkOdeme * krediSuresi;
    }


    public void setHesapNumarasi (int partLength) {

        String dataSource = "0123456789";

        String hesapNumarasi = "";

        for (int i = 0; i < 4; i++) {

            char[] part1 = new char[partLength];

            for (int j = 0; j < partLength; j++) {

                int random = (int) (Math.random() * dataSource.length());
                part1[j] = dataSource.charAt(random);
            }
            hesapNumarasi += new String(part1) + " ";
        }
        this.hesapNumarasi= hesapNumarasi;
    }


    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Account{" +
                "hesapNumarasi=" + hesapNumarasi +
                ", bakiye=" + bakiye +
                '}';
    }
}
