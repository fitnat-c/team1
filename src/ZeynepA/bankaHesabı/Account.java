package ZeynepA.bankaHesabı;

import static ZeynepA.bankaHesabı.Bank.hesapVarMi;
import static ZeynepA.bankaHesabı.Main.input;

public class Account extends Customer{

    private String hesapNumarasi;

    private static int bakiye;

    public Account() {
    }

    public Account(String customerName) {
        super(customerName);
        setHesapNumarasi(4);
    }

    public Account(String hesapNumarasi, int bakiye) {
        super();
        setHesapNumarasi(4);
        this.bakiye = bakiye;
    }

    public Account(String hesapNumarasi, int bakiye, String customerName) {
        super(customerName);
        setHesapNumarasi(4);
    }

    static void paraYatir(){

    }

   static void paraCek(){

     //  Bank banka = new Bank();
     //  System.out.print("Para Çekmek istediğiniz Hesap Numarası: ");
     //  String cekilecekHesap = input.next();
     //  if (!hesapVarMi(cekilecekHesap)) {
     //      System.out.println("Hesap bulunamadı! Lütfen geçerli bir hesap numarası girin.");
     //  }else {
     //      //Account
     //      System.out.print("Çekilecek Miktar: ");
     //      int cekilecekMiktar =input.nextInt();
     //      if (cekilecekMiktar>bakiye) {
     //          if (cekilecekMiktar <= 0) {
     //              System.out.println("Hatalı işlem! Geçerli bir miktar giriniz.");
     //          }
     //          if (cekilecekMiktar > bakiye) {
     //              System.out.println("Yetersiz bakiye! İşlem iptal edildi.");
     //          } else if (cekilecekMiktar < bakiye) {
     //              bakiye -= cekilecekMiktar;
     //              System.out.println("Para çekme işlemi başarılı. Güncel bakiye: " + bakiye);

     //          }
     //      }
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
        return "Account{" + getCustomerName()+" "+ getCustomerNumber()+" "+
                "hesapNumarasi=" + hesapNumarasi +
                ", bakiye=" + bakiye +
                '}';
    }
}
