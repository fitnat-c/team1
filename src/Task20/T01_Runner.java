package Task20;

public class T01_Runner {
     /*
     Task 01 >
     fields: width, length , cevre ve alan hesaplayaan method olan
     T01_Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerlerini print eden code create ediniz.
    */

    public static void main(String[] args) {


        T01_Rectangle rectangle=new T01_Rectangle(8,5);

        rectangle.cevre(rectangle.width, rectangle.length);
        rectangle.alan(rectangle.width, rectangle.length);

        System.out.println("rectangle.width = " + rectangle.width);
        System.out.println("rectangle.length = " + rectangle.length);


    }


}
