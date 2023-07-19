import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        method();


    }
    private static void method(){
        Scanner input = new Scanner(System.in);

        System.out.println(" ismini giriniz:");
        String adSoyad = input.nextLine();

        System.out.println(" kimlik no giriniz:");
        String kimlikNo = input.next();


        System.out.println(" yas giriniz: ");
        int yas = input.nextInt();

        System.out.println("öğrenci numarasını giriniz: ");
        String ogrenciNo = input.next();

        System.out.println("sınıfını giriniz: ");
        String sinif = input.next();

        System.out.println("giriver: ");

        if(input.nextInt()==0){
            method();
        }else
            method2();


    }
    private static void method2() {
        System.out.println("method2 calıstı");
        method();
    }

}