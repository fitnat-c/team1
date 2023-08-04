package ZeynepA.bankaHesabı;

import static ZeynepA.bankaHesabı.Bank.hesapVarMi;
import static ZeynepA.bankaHesabı.Main.input;

public class Account extends Customer{

    private String hesapNumarasi;

    private  double bakiye;

    private boolean vadeliMi;



    public Account() {
    }

    public Account(String customerName,boolean vadeliMi) {
        super(customerName);
        this.vadeliMi=vadeliMi;
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
    public boolean isVadeliMi() {
        return vadeliMi;
    }

    public void setVadeliMi(boolean vadeliMi) {
        this.vadeliMi = vadeliMi;
    }
    public void setHesapNumarasi(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }
    public void bakiyeSorgula() {

        if (isVadeliMi()) {
            System.out.println("Faiz oranını giriniz: ");
            double faizOrani = input.nextDouble();
            System.out.println("Mevduat süresini gun olarak giriniz: ");
            int sure= input.nextInt();
            System.out.println(mevduatFaiziHesapla(faizOrani, sure));

        } else {
            System.out.println(getBakiye());
        }
    }

    public  void paraYatir(){
        System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
        double yatirilanPara= input.nextDouble();
        double bakiye=getBakiye();
        bakiye+=yatirilanPara;
        setBakiye(bakiye);
    }

    public void paraCek(){

        System.out.println("Çekmek isteğinizi miktarı girin: ");
        double cekılecekPara=input.nextDouble();
        double bakiye=getBakiye();
        if (cekılecekPara>bakiye){
            System.out.println("Yetersiz bakiye! İşlem iptal edildi.");
        } else if (cekılecekPara<0) {
            System.out.println("Hatalı işlem! Geçerli bir miktar giriniz.");

        }else if (cekılecekPara<bakiye){
            bakiye-=cekılecekPara;
            setBakiye(bakiye);
            System.out.println("Para çekme işlemi başarılı. Güncel bakiye: " + bakiye);

        }


      }


    public double mevduatFaiziHesapla(double faizOrani, int mevduatSuresi){
        double bakiye=getBakiye();
        bakiye+=bakiye*faizOrani*mevduatSuresi/36500;

        return bakiye;
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
        this.hesapNumarasi= hesapNumarasi.trim();
    }


    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Account{" + getCustomerName()+" "+ getCustomerNumber()+" "+"VadeliMi="+isVadeliMi()+" "+
                "hesapNumarasi=" + hesapNumarasi +
                ", bakiye=" + bakiye +
                '}';
    }


}
