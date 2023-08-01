package ahmetCakir.Task_20;

import java.util.Scanner;

public class T01_RectangularRunner {
    public static void main(String[] args) {
           /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan T01_Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
        System.out.println("Lütfen dikdörtgenin kısa ve uzun kenarlarını sırayla giriniz");
        Scanner input=new Scanner(System.in);
        double kısa=input.nextDouble();
        double uzun=input.nextDouble();
        T01_Rectangular dikdörtgen=new T01_Rectangular(kısa,uzun);
        System.out.println("dikdörtgen = " + dikdörtgen);
        System.out.println("T01_Rectangular.alan() = " + T01_Rectangular.alan(kısa,uzun));
        System.out.println("T01_Rectangular.cevre() = " + T01_Rectangular.cevre(kısa,uzun));
    }
}
