package ahmetCakir.task_26.task06;

public class Task06_a {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.

        randomSayi();


    }

    private static void randomSayi() {
        int toplam=0;
        int sayi1=(int) (Math.random()*10);
        System.out.println("sayi1 = " + sayi1);
        int sayi2=(int) (Math.random()*10);
        System.out.println("sayi2 = " + sayi2);
        toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        try {
            if (toplam<12){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sayı 12'den küçük ise hata verir");
        }


    }


}
